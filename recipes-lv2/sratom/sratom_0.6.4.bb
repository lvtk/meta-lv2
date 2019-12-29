DESCRIPTION = "sratom"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = "serd sord"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRCREV = "84fc8bf02030425672fbf7b595ff6702e0a9e14a"
SRC_URI = "git://github.com/drobilla/sratom.git"
S = "${WORKDIR}/git"

inherit waf
