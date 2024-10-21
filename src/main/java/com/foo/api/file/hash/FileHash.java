package com.foo.api.file.hash;

import com.foo.api.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
