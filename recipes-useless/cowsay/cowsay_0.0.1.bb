DEPENDS += "perl"

SUMMARY = "cowsay package recipe"
LICENSE = "MIT"

SRC_URI = "git://salsa.debian.org/debian/cowsay.git"
SRCREV = "0c06bafe3d9c66817ba71d2806e88dbe04fcafca"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f879dda90a5a9928253a63ecd76406e6"
S = "${WORKDIR}/git"

FILES_${PN} += "\
    ${datadir}/cows/ \
    ${bindir}/cowsay \
    ${bindir}/cowthink \
"

do_install() {
    echo s,%BANGPERL%,!/usr/bin/env perl,\; > install.pl
    echo s,%PREFIX%,${prefix},\; >> install.pl

    install -d ${D}${bindir}
    nativeperl -p install.pl ${S}/cowsay > ${D}${bindir}/cowsay
    chmod a+x ${D}${bindir}/cowsay

    install -m 0755 ${S}/cowsay ${D}${bindir}/cowthink

    install -d ${D}${datadir}/cows
    install -m 0755 ${S}/cows/* ${D}${datadir}/cows
}

RDEPENDS_${PN} = "\
    perl-module-re \
    perl-module-cwd \
    perl-module-text-tabs \
    perl-module-text-wrap \
    perl-module-getopt-std \
    perl-module-file-basename \
"
