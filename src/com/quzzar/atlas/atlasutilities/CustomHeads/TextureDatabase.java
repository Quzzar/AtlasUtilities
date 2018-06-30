package com.quzzar.atlas.atlasutilities.CustomHeads;

import java.util.UUID;

public enum TextureDatabase {
	
	
	CRAFTING_TABLE ("23c2263b-d5c6-425b-b11a-09d662ca1706","http://textures.minecraft.net/texture/7ead389269c04feba791de17c5a7953c41c2cb3663b1346819b3c2ced31b2"),
	
	JUNGLE_BARK ("700d1a4b-28d0-4b72-aba3-702d1c15df73","http://textures.minecraft.net/texture/1cefc19380683015e47c666e5926b15ee57ab33192f6a7e429244cdffcc262"),
	BIRCH_BARK ("669e6257-c8f9-44fc-ad8b-ee90af4f4a30","http://textures.minecraft.net/texture/a221f813dacee0fef8c59f76894dbb26415478d9ddfc44c2e708a6d3b7549b"),
	OAK_BARK ("7a9717dc-8abb-4ef9-ad11-95aabbec4e51","http://textures.minecraft.net/texture/22e4bb979efefd2ddb3f8b1545e59cd360492e12671ec371efc1f88af21ab83"),
	SPRUCE_BARK ("82f78cda-2822-43b0-b23c-f0d0d3922445","http://textures.minecraft.net/texture/966cbdef8efb914d43a213be66b5396f75e5c1b9124f76f67d7cd32525748"),
	ACACIA_BARK ("967dfc58-b7c5-4932-b919-170d1360597d","http://textures.minecraft.net/texture/96a3bba2b7a2b4fa46945b1471777abe4599695545229e782259aed41d6"),
	DARK_OAK_BARK ("9ff09746-90ea-45fc-b861-5caa5742025c","http://textures.minecraft.net/texture/cde9d4e4c343afdb3ed68038450fc6a67cd208b2efc99fb622c718d24aac"),
	
	STONE_FLAT ("6bf97777-5f12-46b2-a8d8-c27d4419c686","http://textures.minecraft.net/texture/8dd0cd158c2bb6618650e3954b2d29237f5b4c0ddc7d258e17380ab6979f071"),
	SANDSTONE_FLAT ("2b150e57-e48b-4564-a3cb-906190332e89","http://textures.minecraft.net/texture/d5605cbe4f552e97a26e358c74fb50c6e6af66bfc3742e662a111981ce6888d6"),
	RED_SANDSTONE_FLAT ("305b78ae-1477-4bae-955e-e19d042957ce","http://textures.minecraft.net/texture/1a71b0caab40412296fcf01c9fe09170758627c41261e6c3423d6dd2549b4b");
	
	private String url;
	private UUID uuid;
	
	TextureDatabase(String rawUUID, String url){
		this.url = url;
		this.uuid = UUID.fromString(rawUUID);
	}
	
	public String getURL(){
		return url;
	}
	
	public UUID getUUID(){
		return uuid;
	}
	
	public static TextureDatabase getTexture(UUID inputUUID){
		for(TextureDatabase tex : TextureDatabase.values()){
			if(tex.getUUID().equals(inputUUID)){
				return tex;
			}
		}
		return null;
	}
	
	public static TextureDatabase getTexture(String inputName){
		for(TextureDatabase tex : TextureDatabase.values()){
			if(tex.name().equalsIgnoreCase(inputName)){
				return tex;
			}
		}
		return null;
	}
	
	
}
