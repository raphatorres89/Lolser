package com.raphaowl.lolser.client.riotgames.response;

import java.util.Arrays;
import java.util.List;

public class ChampionDTOStub {
    public static ChampionDTO createGaren() {
        return ChampionDTO.builder()
                .allytips(getAllytips())
                .blurb("Um guerreiro nobre e orgulhoso, Garen faz parte da Vanguarda Destemida. Popular entre seus companheiros e respeitado o suficiente por seus inimigos, sua reputação é nada mais do que o esperado de um herdeiro da prestigiosa família Stemmaguarda...")
                .enemytips(getEnemytips())
                .id("Garen")
                .image(getImage())
                .info(getInfo())
                .key("86")
                .lore("Um guerreiro nobre e orgulhoso, Garen faz parte da Vanguarda Destemida. Popular entre seus companheiros e respeitado o suficiente por seus inimigos, sua reputação é nada mais do que o esperado de um herdeiro da prestigiosa família Stemmaguarda, encarregada de defender Demacia e seus ideais. Vestido com uma armadura resistente à magia e empunhando uma poderosa espada, Garen está sempre pronto para confrontar magos e feiticeiros no campo de batalha, em um verdadeiro furacão de aço virtuoso.")
                .name("Garen")
                .partype("Nenhum")
                .passive(getPassive())
                .recommended(null)
                .skins(null)
                .spells(null)
                .stats(getGarenStats())
                .tags(Arrays.asList("Fighter", "Tank"))
                .title("o Poder de Demacia")
                .build();
    }

    public static ChampionDTO createWarwick() {
        return ChampionDTO.builder()
                .allytips(getAllytips())
                .blurb("Warwick é um monstro que caça pelas ruas cinzentas de Zaun. Transformado a partir de experimentos agonizantes, seu corpo agora é fundido a um sistema complexo de câmaras e bombas, um maquinário que enche suas veias com fúria química. Ele persegue os...")
                .enemytips(getEnemytips())
                .id("Warwick")
                .image(getImage())
                .info(getInfo())
                .key("19")
                .lore("Warwick é um monstro que caça pelas ruas cinzentas de Zaun. Transformado a partir de experimentos agonizantes, seu corpo agora é fundido a um sistema complexo de câmaras e bombas, um maquinário que enche suas veias com fúria química. Ele persegue os criminosos que aterrorizam as profundezas da cidade, movimentando-se pelas sombras. Warwick é atraído por sangue; para ele, esse aroma é enlouquecedor. Ninguém que derrama sangue é capaz de fugir dele.")
                .name("Warwick")
                .partype("Mana")
                .passive(getPassive())
                .recommended(null)
                .skins(null)
                .spells(null)
                .stats(getWarwickStats())
                .tags(Arrays.asList("Fighter", "Tank"))
                .title("a Ira Desimpedida de Zaum")
                .build();
    }

    private static StatsDTO getGarenStats() {
        return StatsDTO.builder()
                .armor(36.0)
                .armorperlevel(3.0)
                .attackdamage(66.0)
                .attackdamageperlevel(6.65)
                .attackrange(175.0)
                .attackspeed(0.625)
                .attackspeedperlevel(3.65)
                .crit(0.0)
                .critperlevel(0.0)
                .hp(620.0)
                .hpperlevel(84.0)
                .hpregen(8.0)
                .hpregenperlevel(0.5)
                .movespeed(340.0)
                .mp(0.0)
                .mpperlevel(0.0)
                .mpregen(0.0)
                .mpregenperlevel(0.0)
                .spellblock(32.1)
                .spellblockperlevel(1.25)
                .build();
    }

    private static StatsDTO getWarwickStats() {
        return StatsDTO.builder()
                .armor(33.0)
                .armorperlevel(3.2)
                .attackdamage(65.0)
                .attackdamageperlevel(3.0)
                .attackrange(125.0)
                .attackspeed(0.638)
                .attackspeedperlevel(2.3)
                .crit(0.0)
                .critperlevel(0.0)
                .hp(550.0)
                .hpperlevel(85.0)
                .hpregen(4.0)
                .hpregenperlevel(0.75)
                .movespeed(335.0)
                .mp(280.0)
                .mpperlevel(35.0)
                .mpregen(7.466)
                .mpregenperlevel(0.575)
                .spellblock(32.1)
                .spellblockperlevel(1.25)
                .build();
    }

    private static PassiveDTO getPassive() {
        return PassiveDTO.builder()
                .description("Nunc diam sapien, tincidunt eu dui sed, hendrerit pharetra ligula.")
                .image(getImage())
                .name("Suspendisse")
                .build();
    }

    private static ImageDTO getImage() {
        return ImageDTO.builder()
                .full("champion.png")
                .group("champion")
                .sprite("champion1.png")
                .x(144)
                .y(0)
                .w(48)
                .h(48)
                .build();
    }

    private static InfoDTO getInfo() {
        return InfoDTO.builder()
                .attack(7)
                .defense(7)
                .magic(1)
                .difficulty(5)
                .build();
    }

    private static List<String> getAllytips() {
        return Arrays.asList(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
        );
    }

    private static List<String> getEnemytips() {
        return Arrays.asList(
                "Vivamus sollicitudin dui ut velit interdum dapibus ut in enim. Fusce at pharetra felis, non blandit lacus.",
                "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus."
        );
    }
}
