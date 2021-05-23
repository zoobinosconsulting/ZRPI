#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Autotools helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#SRC_URI  = "file://zoobinos-autotools-1.0.tar.gz"
SRC_URI  = "file://Makefile.am"
SRC_URI += "file://configure.ac"
SRC_URI += "file://helloautotools.c" 

S = "${WORKDIR}"

inherit autotools
SRC_URI[md5sum] = "b282082e4e5cc8634b7c6caa822ce440"
