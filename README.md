# Fix Jungle Saplings

[![Modrinth Badge](https://raw.githubusercontent.com/intergrav/devins-badges/c7fd18efdadd1c3f12ae56b49afd834640d2d797/assets/cozy/available/modrinth_vector.svg)](https://modrinth.com/mod/fix-jungle-saplings) [![GitHub Badge](https://raw.githubusercontent.com/intergrav/devins-badges/c7fd18efdadd1c3f12ae56b49afd834640d2d797/assets/cozy/available/github_vector.svg)](https://github.com/ferdinandkeller/fix-jungle-saplings)

Mod made in response to [this video](https://www.youtube.com/watch?v=htbD9vbf9cw).

Jungle Saplings drop rates are broken, this mod fixes this bug by using the same drop rates as other trees in minecraft.

Technically it could be distributed as a single datapack, but it was easier for me that way, and I'm lazy.

If you are interested in seeing the code (a single line in practice), you can check the `FixJungleSaplingsDataGenerator.java` file, it references [that line from the wiki](https://minecraft.wiki/w/Leaves#:~:text=Azalea%20Leaves%20or%20other,Leaves).

If you want to test the mod, I suggest planting a simple 2x2 grid of jungle saplings and then running those commands:

```
/gamerule randomTickSpeed 1000
/fill x1 y1 z1 x2 y2 z2 air replace #logs
```

It will allow to quickly break a naturally generated tree while still getting the effective loot-tables drops.
