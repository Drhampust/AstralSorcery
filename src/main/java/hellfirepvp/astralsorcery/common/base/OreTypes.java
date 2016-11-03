package hellfirepvp.astralsorcery.common.base;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: OreTypes
 * Created by HellFirePvP
 * Date: 03.11.2016 / 01:16
 */
public class OreTypes {

    private static Map<String, Double> oreDictWeights = new HashMap<>();
    private static double totalWeight = 0D;

    public static void init() {
        //Vanilla
        registerOreEntry("oreCoal",        5200D);
        registerOreEntry("oreIron",        2500D);
        registerOreEntry("oreGold",         550D);
        registerOreEntry("oreLapis",        140D);
        registerOreEntry("oreRedstone",     700D);
        registerOreEntry("oreDiamond",      180D);
        registerOreEntry("oreEmerald",      100D);
        //Modded?
        registerOreEntry("oreAluminum",     600D);
        registerOreEntry("oreCopper",      1100D);
        registerOreEntry("oreTin",         1500D);
        registerOreEntry("oreLead",        1000D);
        registerOreEntry("oreCertusQuartz", 500D);
        registerOreEntry("oreNickel",       270D);
        registerOreEntry("orePlatinum",      90D);
        registerOreEntry("oreSilver",       180D);
        registerOreEntry("oreMithril",        1D);
        registerOreEntry("oreRuby",         400D);
        registerOreEntry("oreSapphire",     400D);
        registerOreEntry("oreUranium",      550D);
        registerOreEntry("oreYellorite",    560D);
        registerOreEntry("oreZinc",         300D);
        registerOreEntry("oreSulfur",       600D);
        registerOreEntry("oreOsmium",       950D);
    }

    public static void registerOreEntry(String oreDictName, Double weight) {
        oreDictWeights.put(oreDictName, weight);
        totalWeight += weight;
    }

    @Nullable
    public static ItemStack getRandomOre(Random random) {
        String key = null;
        double randWeight = random.nextFloat() * totalWeight;
        for (Map.Entry<String, Double> entry : oreDictWeights.entrySet()) {
            randWeight -= entry.getValue();
            if(randWeight <= 0) {
                key = entry.getKey();
                break;
            }
        }
        if(key == null) return null;
        List<ItemStack> ores = OreDictionary.getOres(key);
        for (ItemStack stack : ores) {
            if(Block.getBlockFromItem(stack.getItem()) == null) continue;
            String className = stack.getItem().getClass().getName();
            if(!className.contains("greg")) {
                return stack;
            }
        }
        return getRandomOre(random);
    }

}
