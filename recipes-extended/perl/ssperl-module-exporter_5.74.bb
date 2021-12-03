DEPENDS += "perl"
SUMMARY = "Perl Text::Tabs extension"
LICENSE = "Unlicense"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TODDR/Exporter-${PV}.tar.gz"
SRC_URI[md5sum] = "9a7918151c99c55328b30a65770b953a"
LIC_FILES_CHKSUM = "file://README;md5=0c28fd40607e07c77b942b466418cff3"

S = "${WORKDIR}/Exporter-${PV}"

inherit cpan ptest-perl

RDEPENDS_${PN}-ptest += "perl-module-test-more perl-module-utf8"
