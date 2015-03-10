# Copyright (C) 2014 Unknow User <unknow@user.org>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "XCSoar Maps FLARMNET Database"
HOMEPAGE = ""
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=c79ff39f19dfec6d293b95dea7b07891"
SECTION = "base/app"

S = "${WORKDIR}"
PR = "r3"


SRC_URI =      " \
	http://www.flarmnet.org/files/data.fln;name=flarmnet \
"


SRC_URI[flarmnet.md5sum] = "e84c5c163e8db44f8543c87f90f191c "
SRC_URI[flarmnet.sha256sum] = "30abc60cf4072d3acc9baa33295cc7a112bdca109dd21226257ebd044b11ed98"

addtask do_package_write_ipk after do_package after do_install

do_compile() {
        :
}

do_install() {
        echo "Installing ..."
        install -d ${D}/home/root/.xcsoar
        install -m 0755 ${S}/data.fln ${D}/home/root/.xcsoar/
}

FILES_${PN} = "/home/root/.xcsoar/*"

