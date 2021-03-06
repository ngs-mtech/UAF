/*
 * Copyright 2015 eBay Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nexenio.fido.uaf.core.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class DisplayPngCharacteristicsDescriptor {

    /**
     * Image width.
     */
    @SerializedName("width")
    @JsonProperty("width")
    private long width;

    /**
     * Image height.
     */
    @SerializedName("height")
    @JsonProperty("height")
    private long height;

    /**
     * Bit depth - bits per sample or per palette index.
     */
    @SerializedName("bitDepth")
    @JsonProperty("bitDepth")
    private String bitDepth;

    /**
     * Color type defines the PNG image type.
     */
    @SerializedName("colorType")
    @JsonProperty("colorType")
    private String colorType;

    /**
     * Compression method used to compress the image data.
     */
    @SerializedName("compression")
    @JsonProperty("compression")
    private String compression;

    /**
     * Filter method is the preprocessing method applied to the image data before compression.
     */
    @SerializedName("filter")
    @JsonProperty("filter")
    private String filter;

    /**
     * Interlace method is the transmission order of the image data.
     */
    @SerializedName("interlace")
    @JsonProperty("interlace")
    private String interlace;

    /**
     * 1 to 256 palette entries
     */
    @SerializedName("plte")
    @JsonProperty("plte")
    private RgbPaletteEntry[] rgbPaletteEntries;

}
