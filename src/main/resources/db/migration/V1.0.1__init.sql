DROP TABLE IF EXISTS wine CASCADE;
DROP TABLE IF EXISTS winegrapesinfo CASCADE;
DROP TABLE IF EXISTS wine_grapes CASCADE;
DROP TABLE IF EXISTS grapes CASCADE;
DROP TABLE IF EXISTS brands CASCADE;
DROP TABLE IF EXISTS countries CASCADE;

CREATE TABLE grapes (
    grape_id UUID PRIMARY KEY,
    grape_name TEXT NOT NULL UNIQUE
);

CREATE TABLE brands (
    brand_id UUID PRIMARY KEY UNIQUE,
    brand_name TEXT NOT NULL UNIQUE
);

CREATE TABLE countries (
    country_id UUID PRIMARY KEY UNIQUE,
    country_name TEXT NOT NULL UNIQUE
);

CREATE TABLE wine (
    wine_id UUID PRIMARY KEY,
    name TEXT NOT NULL,
    picture BYTEA,
    brand_id UUID REFERENCES brands(brand_id)  NOT NULL,
    country_id UUID REFERENCES countries(country_id)  NOT NULL,
    volume FLOAT NOT NULL,
    abv FLOAT NOT NULL,
    color_type TEXT NOT NULL,
    sugar_type TEXT NOT NULL
);

CREATE TABLE wine_grapes (
     id uuid PRIMARY KEY,
     wine_id UUID REFERENCES  wine(wine_id) NOT NULL,
     grape_id UUID REFERENCES grapes(grape_id)  NOT NULL
);