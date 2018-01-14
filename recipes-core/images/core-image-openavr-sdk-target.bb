SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = " \
    packagegroup-core-boot \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    packagegroup-sdk-target \
    git \
    file \
    coreutils \
    util-linux \
    iputils \
    sysfsutils \
    usbutils \
    openssl \
    i2c-tools \
    openssh \
    vim \
    procps \
    htop \
    python3 \
    python3-pip \
    minicom \
    screen \
    bash \
    modemmanager \
"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
