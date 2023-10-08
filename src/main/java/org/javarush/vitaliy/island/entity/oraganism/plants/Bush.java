package org.javarush.vitaliy.island.entity.oraganism.plants;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.javarush.vitaliy.island.abstraction.annotations.Config;
import org.javarush.vitaliy.island.abstraction.annotations.GameObjectEntity;
import org.javarush.vitaliy.island.abstraction.interfaces.GameEntity;


@GameObjectEntity
@Config(fileName = "config/entities/plants/bush.yaml")
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Bush extends Plant implements GameEntity {


    public Bush reproduce() {
        return Bush.builder()
                .limits(getLimits())
                .icon(getIcon())
                .lastReproductionYear(getLastReproductionYear()).
                isEaten(getIsEaten())
                .build();
    }

//    @Override
//    public void setGameObjectCell(Cell cell) {
//
//    }
//
//    @Override
//    public String getGameObjectIcon() {
//        return null;
//    }
}
