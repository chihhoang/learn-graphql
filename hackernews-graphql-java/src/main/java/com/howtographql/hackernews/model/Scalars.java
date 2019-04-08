package com.howtographql.hackernews.model;

import graphql.language.StringValue;
import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Scalars {
    public static GraphQLScalarType dateTime = new GraphQLScalarType("DateTime", "DateTime scalar", new Coercing() {
        @Override
        public Object serialize(Object o) {
            return ((ZonedDateTime) o).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        @Override
        public Object parseValue(Object o) {
            return serialize(o);
        }

        @Override
        public Object parseLiteral(Object o) {
            return o instanceof StringValue ? ZonedDateTime.parse(((StringValue) o).getValue()) : null;
        }
    });
}
