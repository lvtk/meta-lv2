DESCRIPTION = "LV2 Plugin Standard"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = ""

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRCREV = "06d3f56a39be35b73b7c687920da871b24913edd"
SRC_URI = "gitsm://github.com/drobilla/lv2.git"
S = "${WORKDIR}/git"

inherit waf

do_install() {
    (cd ${S} && ./waf install --destdir=${D})
    rm -rf "${D}/${prefix}/share"
}
