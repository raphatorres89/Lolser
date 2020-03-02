package com.raphaowl.lolser.client.riotgames.response;

import java.util.Arrays;
import java.util.List;

public class ChampionDTOStub {
    public static ChampionDTO valid() {
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
                .stats(null)
                .tags(Arrays.asList("Fighter", "Tank"))
                .title("o Poder de Demacia")
                .build();
    }

    private static PassiveDTO getPassive() {
        return PassiveDTO.builder()
                .description("Se Garen não tiver sido atingido recentemente por dano ou habilidades inimigas, ele regenera um percentual de sua Vida total a cada segundo.")
                .image(getImage())
                .name("Perseverança")
                .build();
    }

    private static ImageDTO getImage() {
        return ImageDTO.builder()
                .full("Garen.png")
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
                "A regeneração de Garen aumenta drasticamente caso ele possa evitar o recebimento de dano por muitos segundos.",
                "Julgamento causa o máximo de dano quando atinge um único alvo. Para trocas eficazes, tente posicionar-se de maneira que somente o campeão inimigo seja atingido.",
                "Garen só é impedido por Tempos de Recarga, o que faz de itens tais como a Lâmina Fantasma de Youmuu e o Brutalizador muito eficazes para ele."
        );
    }

    private static List<String> getEnemytips() {
        return Arrays.asList(
                "Acumule itens de Armadura para reduzir a grande quantidade de Dano Físico que Garen causa.",
                "Tente fugir de Garen conforme sua Vida diminui, pois ele pode lhe executar rapidamente com Justiça Demaciana.",
                "Muito cuidado ao atacar Garen em um arbusto. Isto normalmente leva a receber o dano total de Julgamento.",
                "Julgamento causa o máximo de dano quando atinge um único alvo. Se não for possível escapar de seu raio, mova-se através de tropas aliadas para reduzir o dano recebido."
        );
    }
}
