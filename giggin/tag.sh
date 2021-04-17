#!/usr/bin/env bash

readonly TAG="${1:?Missing tag}"

git add :/
git commit -m "${TAG:?}"
git tag -a "${TAG:?}" -m "${TAG:?}"
git push && git push --tags && git tag --list
