#!/bin/bash
mongo nbd zapytanie_$1_$2.js > wyniki_$1_$2.json
cat wyniki_$1_$2.json
