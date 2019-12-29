DESCRIPTION = "serd"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = ""

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRCREV = "v0.16.4"
SRC_URI = "git://github.com/drobilla/sord.git"
S = "${WORKDIR}/git"

inherit waf
