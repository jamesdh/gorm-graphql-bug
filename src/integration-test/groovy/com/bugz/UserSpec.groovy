package com.bugz

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class UserSpec extends Specification{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        given: "a user without an address"
        User user = new User(name: "user1")

        when:
        user.save(flush: true, failOnError: true)

        then:
        user.id
    }
}
