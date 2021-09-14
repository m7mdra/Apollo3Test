package com.m7mdra.apollo3test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.apollographql.apollo3.ApolloClient
import com.example.AllLunchesQuery
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apolloClient = ApolloClient("https://apollo-fullstack-tutorial.herokuapp.com/graphql")
        apolloClient.query(AllLunchesQuery())

    }
}