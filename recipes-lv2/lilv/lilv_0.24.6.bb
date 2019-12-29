DESCRIPTION = "lilv"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = "serd sord sratom"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRCREV = "v0.24.6"
SRC_URI = "git://github.com/drobilla/lilv.git"
S = "${WORKDIR}/git"

inherit waf
