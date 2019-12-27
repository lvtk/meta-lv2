DESCRIPTION = "LV2 Plugin Standard"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = ""

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRCREV = "0fa4d4847eb6d5bb0f58da889933c94c37ecb730"
SRC_URI = "git://github.com/drobilla/lv2.git"
S = "${WORKDIR}/git"

inherit waf

do_install() {
    ./waf install --destdir="${D}"
    rm -rf "${D}/${prefix}/lv2specgen"
}
