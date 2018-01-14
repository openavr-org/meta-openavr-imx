FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://root.bashrc \
    file://root.bash_profile \
    file://root.vimrc \
"

do_install_append() {
    install -d ${D}/home/root
    install -m 0644 ${S}/root.bashrc ${D}/home/root/.bashrc
    install -m 0644 ${S}/root.bash_profile ${D}/home/root/.bash_profile
    install -m 0644 ${S}/root.vimrc ${D}/home/root/.vimrc
}

FILES_${PN} += " \
    /home/root/.bashrc \
    /home/root/.bash_profile \
    /home/root/.vimrc \
"
