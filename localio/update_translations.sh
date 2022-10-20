#!/usr/bin/env bash
echo "Checking localio install"
if ! command -v localize &> /dev/null
then
    echo "Installing localio..."
    gem install localio
else
  echo "Localio already installed"
fi

echo "Running translation script"

localize
