DEPENDS += "perl"
SUMMARY = "Perl Text::Tabs extension"
LICENSE = "Unlicense"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARISTOTLE/Text-Tabs+Wrap-${PV}.tar.gz"
SRC_URI[md5sum] = "3fb4d773c9381c02ef97c2a4020e90b9"
LIC_FILES_CHKSUM = "file://README;md5=4f2a74687b439745820d68425ee28c1b"

S = "${WORKDIR}/Text-Tabs+Wrap-${PV}"

inherit cpan ptest-perl

RDEPENDS_${PN}-ptest += "perl-module-test-more perl-module-utf8"
