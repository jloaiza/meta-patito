DEPENDS += "ncurses ncurses-native"

SRC_URI = "git://github.com/mtoyoda/sl.git"
SRCREV = "0fd8d6f6484cddc2b58ffa501b9ae0bf0b3f0742"
LIC_FILES_CHKSUM = "file://LICENSE;md5=74e9dd589a0ab212a9002b15ef2b82f0"
LICENSE = "Unlicense"
S = "${WORKDIR}/git"

# base.bbclass: There is no clean target in the package
CLEANBROKEN = "1"

# CFLAGS_prepend = "-I ${STAGING_INCDIR} -L ${STAGING_LIBDIR}"

do_compile() {
    ${CC} ${CFLAGS} -o sl sl.c -lncurses
}

do_install() {
    install -d ${D}/${bindir}
    install -m 0755 sl ${D}/${bindir}
}
