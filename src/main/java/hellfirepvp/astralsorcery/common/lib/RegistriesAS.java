/*******************************************************************************
 * HellFirePvP / Astral Sorcery 2019
 *
 * All rights reserved.
 * The source code is available on github: https://github.com/HellFirePvP/AstralSorcery
 * For further details, see the License file there.
 ******************************************************************************/

package hellfirepvp.astralsorcery.common.lib;

import hellfirepvp.astralsorcery.AstralSorcery;
import hellfirepvp.astralsorcery.common.constellation.IConstellation;
import hellfirepvp.astralsorcery.common.constellation.perk.AbstractPerk;
import hellfirepvp.astralsorcery.common.util.sextant.TargetObject;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryModifiable;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: RegistriesAS
 * Created by HellFirePvP
 * Date: 02.06.2019 / 09:17
 */
public class RegistriesAS {

    private RegistriesAS() {}

    public static final ResourceLocation REGISTRY_NAME_CONSTELLATIONS = new ResourceLocation(AstralSorcery.MODID, "constellations");
    public static final ResourceLocation REGISTRY_NAME_PERKS = new ResourceLocation(AstralSorcery.MODID, "perks");
    public static final ResourceLocation REGISTRY_NAME_SEXTANT_TARGETS = new ResourceLocation(AstralSorcery.MODID, "sextant_targets");

    public static IForgeRegistry<IConstellation> REGISTRY_CONSTELLATIONS;
    public static IForgeRegistryModifiable<AbstractPerk> REGISTRY_PERKS;
    public static IForgeRegistry<TargetObject> REGISTRY_SEXTANT_TARGET;

}
