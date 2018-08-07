#!/bin/bash

# Generate changelog
grails dbm-generate-gorm-changelog changelog.groovy

# Update database
grails dbm-update --dataSource=migrations

# Generate diff
grails dbm-gorm-diff <filename> --defaultSchema=liquibase_demo --add

