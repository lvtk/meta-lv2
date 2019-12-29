DESCRIPTION = "suil"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = "lv2"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRCREV = "d738e9b106e728417f4235332caed64c2b44b7e1"
SRC_URI = "git://github.com/drobilla/suil.git"
S = "${WORKDIR}/git"

inherit waf
