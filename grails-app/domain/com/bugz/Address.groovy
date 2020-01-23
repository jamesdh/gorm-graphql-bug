package com.bugz

import org.grails.gorm.graphql.entity.dsl.GraphQLMapping

class Address {

    String name
    Map coordinates
    Set<User> owners

    static hasMany = [
        owners: User
    ]

    static graphql = GraphQLMapping.build {
        exclude 'coordinates'
        operations.get.enabled false
        operations.list.enabled false
        operations.count.enabled false
        operations.create.enabled false
        operations.delete.enabled false
        operations.update.enabled false
    }
}
