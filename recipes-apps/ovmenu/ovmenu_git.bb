# Copyright (C) 2014 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "OpenVario start menu"
HOMEPAGE = "www.openvario.org"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=c79ff39f19dfec6d293b95dea7b07891"
SECTION = "base/app"
DEPENDS = ""
PR = "r0"

S = "${WORKDIR}/git"

SRC_URI = "git://www.openvario.org/git-repos/ovmenu.git;protocol=http;rev=master;user=guest:Thahh3th \
"

do_compile() {
	echo "Making .."
	echo '${WORKDIR}'
	cd ${WORKDIR}/git
	make
}

do_install() {
	install -d ${D}/opt/bin
	install -m 0755 ${S}/ovmenu ${D}/opt/bin
}

PACKAGES = "${PN}"
FILES_${PN} = "/opt/bin/ovmenu \
"
