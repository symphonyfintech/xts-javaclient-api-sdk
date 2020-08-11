#!/bin/sh

##
## Set environment variables for the XTSScanner Platform
##
## Version: 0.1.0-SNAPSHOT
##


# Make sure we're not the root user.
if [ "$(id -u)" = "0" ]; then
    echo "This script must not be run as root." 1>&2
    exit 1
fi

export SCANNER_HOME="/usr/xtsscanner"

export JAVA_HOME=/usr/lib/jvm/jre-1.8.0-openjdk 

export PATH=${JAVA_HOME}/bin:${PATH}

echo PATH=$PATH

