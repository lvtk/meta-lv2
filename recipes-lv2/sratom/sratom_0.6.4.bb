DESCRIPTION = "sratom"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = "lv2 serd sord"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=ebc7934238811c788037421c6c548ddf"

SRCREV = "84fc8bf02030425672fbf7b595ff6702e0a9e14a"
SRC_URI = "gitsm://github.com/drobilla/sratom.git"
S = "${WORKDIR}/git"

inherit waf
inherit pkgconfig
