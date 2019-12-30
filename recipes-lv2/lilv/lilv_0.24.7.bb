DESCRIPTION = "lilv"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = "lv2 serd sord sratom"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0c6c8928b7dc2190a0aff762ae5a0f64"

SRCREV = "d1c9d1b6f1df03c4ee49eac544e3f6771e03fdcb"
SRC_URI = "gitsm://github.com/drobilla/lilv.git"
S = "${WORKDIR}/git"

inherit waf
inherit pkgconfig

do_install() {
    (cd ${S} && ./waf install --destdir=${D})
    rm -rf "${D}/${prefix}/etc"
    rm -rf "${D}/${prefix}/lib/python2.7"
}
