DESCRIPTION = "suil"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = "lv2"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRCREV = "v0.10.6"
SRC_URI = "git://github.com/drobilla/suil.git"
S = "${WORKDIR}/git"

inherit waf
