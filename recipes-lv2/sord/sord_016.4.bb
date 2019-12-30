DESCRIPTION = "serd"
HOMEPAGE = "http://lv2plug.in"
SECTION = "audio"
DEPENDS = "serd"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=6b8d060e6d32fbd53684f9dc0443b6a3"

SRCREV = "834610cd3faceff24c083738dbe88a56d412368c"
SRC_URI = "gitsm://github.com/drobilla/sord.git"
S = "${WORKDIR}/git"

inherit waf
inherit pkgconfig
