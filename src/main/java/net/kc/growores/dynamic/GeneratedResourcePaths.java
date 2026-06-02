package net.kc.growores.dynamic;

import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;
import java.nio.file.Path;

public final class GeneratedResourcePaths {
    private static final Path GENERATED_ROOT = findGeneratedRoot();

    private GeneratedResourcePaths() {
    }

    public static Path generatedPackRoot() {
        return GENERATED_ROOT;
    }

    public static File debugGeneratedResource(String path) {
        return GENERATED_ROOT
                .resolve(path)
                .toFile();
    }

    private static Path findGeneratedRoot() {
        Path current = Path.of("").toAbsolutePath().normalize();

        if (current.resolve("src/main/resources").toFile().isDirectory()) {
            return current.resolve("generated_reeds");
        }

        Path parent = current.getParent();

        if (parent != null && parent.resolve("src/main/resources").toFile().isDirectory()) {
            return parent.resolve("generated_reeds");
        }

        return FMLPaths.GAMEDIR.get().resolve("generated_reeds").normalize();
    }
}
