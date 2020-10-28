#!/bin/bash
mongo nbd zapytanie_$1.js > wyniki_$1.json
cat wyniki_$1.json
