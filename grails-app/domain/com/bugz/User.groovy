package com.bugz

import org.grails.gorm.graphql.entity.dsl.GraphQLMapping

class User {

    String name
    Address address

    static constraints = {
        address nullable: true
    }

    static graphql = GraphQLMapping.build {
//        operations.get.enabled false
        operations.list.enabled false
        operations.count.enabled false
        operations.create.enabled false
        operations.delete.enabled false
        operations.update.enabled false
    }
}
