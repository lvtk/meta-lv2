DESCRIPTION = "serd"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = ""

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=7aceb3a3edc99517b08f5cdd557e11fb"

SRCREV = "2efb107eb4d4381198de51bd4f092ae1ead02e31"
SRC_URI = "gitsm://github.com/drobilla/serd.git"
S = "${WORKDIR}/git"

inherit waf
