#!/bin/bash

# the image will be removed when stopped
docker run --rm -it -v `pwd`:/host krrt/tcf-client

# ^C to stop
