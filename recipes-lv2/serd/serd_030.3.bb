DESCRIPTION = "serd"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = ""

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=0383f162366b0c5a316292759a55d292"

SRCREV = "2efb107eb4d4381198de51bd4f092ae1ead02e31"
SRC_URI = "git://github.com/drobilla/serd.git"
S = "${WORKDIR}/git"

inherit waf
