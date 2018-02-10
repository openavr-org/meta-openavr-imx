SUMMARY = "An image which includes dev tools and networking tools."

IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_FEATURES += "tools-debug"
IMAGE_FEATURES += "tools-sdk"
#IMAGE_FEATURES += "dev-pkgs"

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    git \
    usbutils \
    i2c-tools \
    vim \
    htop \
    python3 \
    python3-pip \
    minicom \
    screen \
    modemmanager \
    networkd-config \
"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
