package com.wine.to.up.simple.parser.service.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.io.File;
import java.util.UUID;

@Entity
@Table(name = "wine")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Wine {
    @Id
    @Column(name = "wineId")
    private UUID wineID = UUID.randomUUID();

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private File picture;

    @ManyToOne
    @JoinColumn(name = "brandId", referencedColumnName = "brandId")
    @NonNull
    private Brands brandID;

    @ManyToOne
    @JoinColumn(name = "countryId", referencedColumnName = "countryId")
    @NonNull
    private Countries countryID;

    @Column(name = "volume")
    private Float volume;

    @Column(name = "abv")
    private Float abv; // alcohol by volume

    @Column(name = "colorType")
    @NonNull
    private String colorType;

    @Column(name = "sugarType")
    @NonNull
    private String sugarType;

    public Wine(@NonNull String name, @NonNull Brands brandID, @NonNull Countries countryID, @NonNull Float volume, @NonNull Float abv,
                @NonNull String colorType, @NonNull String sugarType) {
        this.name = name;
        this.brandID = brandID;
        this.countryID = countryID;
        this.volume = volume;
        this.abv = abv;
        this.colorType = colorType;
        this.sugarType = sugarType;
    }
}
