package fr.wikimnv.moderation.metier;

public interface IArticle {
	public abstract void publierArticle();
	public abstract void depublierArticle();
	public abstract void archiverArticle();
	public abstract void censurerArticle();
}
