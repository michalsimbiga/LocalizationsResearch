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

cd feature_one
localize
cd ..
cd feature_two
localize
cd ..
cd feature_three
localize
cd ..