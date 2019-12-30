DESCRIPTION = "suil"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = "lv2"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=31b283049b7bf3fc441d62cd43d8f4b9"

SRCREV = "d738e9b106e728417f4235332caed64c2b44b7e1"
SRC_URI = "gitsm://github.com/drobilla/suil.git"
S = "${WORKDIR}/git"

inherit waf
inherit pkgconfig
