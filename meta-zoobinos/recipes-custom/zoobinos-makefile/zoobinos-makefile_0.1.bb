#
# This file was derived from the 'Hello make file!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "hello make file application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://Makefile file://hellomakefile.c"

S = "${WORKDIR}"

do_compile() {
	oe_runmake
}

do_install() {
	oe_runmake DESTDIR="${D}${bindir}" install
}

