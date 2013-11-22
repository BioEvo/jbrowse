package org.gmod.gbol.test;

import java.sql.Timestamp;
import java.util.Collection;

import org.gmod.gbol.bioObject.AbstractSingleLocationBioFeature;
import org.gmod.gbol.bioObject.CDS;
import org.gmod.gbol.bioObject.Chromosome;
import org.gmod.gbol.bioObject.Exon;
import org.gmod.gbol.bioObject.Frameshift;
import org.gmod.gbol.bioObject.Gene;
import org.gmod.gbol.bioObject.Minus1Frameshift;
import org.gmod.gbol.bioObject.Minus2Frameshift;
import org.gmod.gbol.bioObject.Plus1Frameshift;
import org.gmod.gbol.bioObject.Plus2Frameshift;
import org.gmod.gbol.bioObject.Transcript;
import org.gmod.gbol.bioObject.conf.BioObjectConfiguration;
import org.gmod.gbol.simpleObject.Organism;

import junit.framework.TestCase;

public class BioFeatureTest extends TestCase {

	private Organism organism;
	private BioObjectConfiguration conf;

	public void setUp() {
		organism = new Organism("Foomus", "barius");
		conf = new BioObjectConfiguration("testSupport/gbolThree.mapping.xml");
	}
	
	public void testGetResidues() {
		System.out.println("== testGetResidues() ==");

		Gene gene = createGene(1);
		printGene(gene);
		System.out.println("gene (plus): " + gene.getResidues());
		assertEquals("gene residues (plus): ", "ATATCTTTTCTCACAATCGTTGCAGAGGACTTGTATGCACTTTAGACGTGGAAGAAGAATCGCGAGACTTTTCGGTGTGTCGGAGAGAGTGTTCATCGATCGTGCCTTTTGGCGTTAGGCGCGATTATGTCGCATGCTGTGTGAGTGTGTCTCTCTCGGCCACTGTAGGATGTTCGTGTCGATGCGAGTTTGTGAAATGCTAGGTCAATGTTGCTTGGTTCACAGTTTCGTACCTAGTTTGCGATCTGTCTGATTCGTTGTGTGGATGTAGAGAGCCTCTGGTGCGTAATGTAGGCTGGTTGGGACACATTTGACTTGTTCTGTAGGGTCGATCTGTCGATGGGGCTCTGGGTTTCCGATGTTTCTCCGTAGAGGGAGTTCTTCTGTATGTTTGTTTGTGGTTAGATCTGCTTTTGGAATCAATGAGCATTGCGAAGACTATTTCTCCTGCTAAAGAACTTTTCGATCGTCAAATAATTGTGATGATCTTTCTACCATTAAAGATTCCATTAGAGTCTTTGTTTGCCATGCATGTTTGGGATCGAGGATATTTGAAGCATACAGTGGTCTAATGTAGCGATTTCTTAACAACAATGCTTCCATTTCTTTTGCAGAGTATATAGAAATCATCGACAATCATGAATCAGTACGGAAGAGAACAGCAAGATACTGGCCTCGTCGGCTCTGGTACAGGTAATGAAATGTTTTTTTTGCGATTTTAAACACTGTTTTCCGTGGATTGATGATGAACGATCCTCAAAGGTCTTTTTTATTTTCGGCACGGAACCCCTCGCAATCTTTGGTGTAGCTCATTTGTTCTCGCTAACGATCCATCTTCTGATGGTGTAGGACATCGCGATGAATACGGCAATCCCAGGCAAGAGGGTATAATGGACAAGGTGAAAAATGCCGTAGGCATGGGCCCCAGTTCAGGAACCGGCTACAACAATCAGCCTGGTTATGACAATTACGGTAACCCAAGGCAAGAAGGATTAGTAGACAAGGCGAAGGACGCCGTGGGCATGGGTCCGAGTTTAGGAACTGGCTACAATAACCAGCCTGGTTATGACAGTTACGGGAATCGTGAGGGCATTGTGGACAGGGCGAAAGATGCGGTAGGGATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGGTACGACAATTACGGTGACCGAAGGCATGAAGGATTGGCAGACAGAGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACCACCAGCCTGGATATGACAACTACGGCAATCGTGAGGGCGTTGTGGACAAGGCGAAGGATGCGGTAGGCATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGTTATGACAGTTATGGTACCCGGAGACAGGAAGGATTGGTAGATAGAGCAAAGGATGCCGTCGGCATGGGCCCCAATTCGGGCACCGGCTATAACAATCAGCCCGGATATGACAACTACGGTAACCCAAGACGCGAAGGAGTGGTAGACAGGGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACAATCAGCCCGGATATGACAACTACGGCAATCGTGAGGGCATTGTGGACAAAGCCAAGGATGCAGTCGGTGTTGGCCCCCACTCGGGTACTGGCTACCACAACCAGCCCAGCTACGACAACTATGGCAACCCTAGGCAAGAGGGAATCGTGGATAGAGCGAAAGACGCTGTGGGGATGGGACCAAACTCTGGAACTGGCTACAACAACCAGTCTGATTATGACAGTTATGGCAACCCAAGGCACGAAGGCATGCTTGACAAGGCGAAGGATGACTTTGATATGGGCCCCAATTCCGGCACTGGCTATAACAACCGGCCCGGCTATGACACCTATGGGGACCGAAAACACGAGGGAATTGGTGACAAGGTGAGGGACGCAATCGGTACTGGCCCAAACTCCGGATATGACAGCCGCACACCCACCGGAACCGACGCTTACGTGCATGGCAACCATCCCCCTGGTATGCAAGACAGAATCACTGGCGTGAACGAGCCCTCGATCTTAGGTGGACGTGAGAATGTAGACCGCCATGGTTTTGGACACGATGGTCGCCAACATCACGGTCTGCTAGATAATGTTACTCTTCAAAGTGGCCATATTCCTGAGACTATGGTAGGCGGGCGCCGTGTTGAACCTGGATATGATATGACCAAGAGTGCTGGACATCATCGTGAGTCTACCATGCTATATCTTCTTGCAAATTATTTCGAAGTTTAGGCAGCTTGTTGAANTCTGCTAAATTGGTGGTGCTTCATGGTTTTGGAAAATCGGTGATTCCGCTGTTGTGGTGCTCATTCCTTCGTGTTAACTTGATTGATGGTAATGTGGTGTCGATGCAGTTACTGATCTTGGCCATCACGGTAACGATAGCGGTGTCACTGGATTGGGCCATCACGACACTGATTACGATGAGAGGAGGGGAAAAGGATTTGAAGACCCGATTGATAACAAAACCGGACTTGGATCAGACTACGATACGACCGAGACCGGATCTGGTTATGGTGCCACCGATACTGGTGCTGCACCTCACAAGAAGGGAATCATAACTAAGATCAAGGAGAAGCTGCACCACTAGAGAAGGAAGCGTAGTAATCTATCATGTAAATGGAGATTTGGTTTCTTGCAGAAACACCTGGTGTAATTTTTGTTTCATGAAATGTGAATATTTGAGTTTTTGTTAAT", gene.getResidues());
		Transcript transcript = gene.getTranscripts().iterator().next();
		System.out.println("transcript (plus): "  + transcript.getResidues());
		assertEquals("transcript residues (plus): ", "ATGAATCAGTACGGAAGAGAACAGCAAGATACTGGCCTCGTCGGCTCTGGTACAGGACATCGCGATGAATACGGCAATCCCAGGCAAGAGGGTATAATGGACAAGGTGAAAAATGCCGTAGGCATGGGCCCCAGTTCAGGAACCGGCTACAACAATCAGCCTGGTTATGACAATTACGGTAACCCAAGGCAAGAAGGATTAGTAGACAAGGCGAAGGACGCCGTGGGCATGGGTCCGAGTTTAGGAACTGGCTACAATAACCAGCCTGGTTATGACAGTTACGGGAATCGTGAGGGCATTGTGGACAGGGCGAAAGATGCGGTAGGGATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGGTACGACAATTACGGTGACCGAAGGCATGAAGGATTGGCAGACAGAGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACCACCAGCCTGGATATGACAACTACGGCAATCGTGAGGGCGTTGTGGACAAGGCGAAGGATGCGGTAGGCATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGTTATGACAGTTATGGTACCCGGAGACAGGAAGGATTGGTAGATAGAGCAAAGGATGCCGTCGGCATGGGCCCCAATTCGGGCACCGGCTATAACAATCAGCCCGGATATGACAACTACGGTAACCCAAGACGCGAAGGAGTGGTAGACAGGGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACAATCAGCCCGGATATGACAACTACGGCAATCGTGAGGGCATTGTGGACAAAGCCAAGGATGCAGTCGGTGTTGGCCCCCACTCGGGTACTGGCTACCACAACCAGCCCAGCTACGACAACTATGGCAACCCTAGGCAAGAGGGAATCGTGGATAGAGCGAAAGACGCTGTGGGGATGGGACCAAACTCTGGAACTGGCTACAACAACCAGTCTGATTATGACAGTTATGGCAACCCAAGGCACGAAGGCATGCTTGACAAGGCGAAGGATGACTTTGATATGGGCCCCAATTCCGGCACTGGCTATAACAACCGGCCCGGCTATGACACCTATGGGGACCGAAAACACGAGGGAATTGGTGACAAGGTGAGGGACGCAATCGGTACTGGCCCAAACTCCGGATATGACAGCCGCACACCCACCGGAACCGACGCTTACGTGCATGGCAACCATCCCCCTGGTATGCAAGACAGAATCACTGGCGTGAACGAGCCCTCGATCTTAGGTGGACGTGAGAATGTAGACCGCCATGGTTTTGGACACGATGGTCGCCAACATCACGGTCTGCTAGATAATGTTACTCTTCAAAGTGGCCATATTCCTGAGACTATGGTAGGCGGGCGCCGTGTTGAACCTGGATATGATATGACCAAGAGTGCTGGACATCATCTTACTGATCTTGGCCATCACGGTAACGATAGCGGTGTCACTGGATTGGGCCATCACGACACTGATTACGATGAGAGGAGGGGAAAAGGATTTGAAGACCCGATTGATAACAAAACCGGACTTGGATCAGACTACGATACGACCGAGACCGGATCTGGTTATGGTGCCACCGATACTGGTGCTGCACCTCACAAGAAGGGAATCATAACTAAGATCAAGGAGAAGCTGCACCACTAG", transcript.getResidues());
		CDS cds = transcript.getCDS();
		System.out.println("cds (plus): " + cds.getResidues());
		assertEquals("cds residues (plus): ", "ATGAATCAGTACGGAAGAGAACAGCAAGATACTGGCCTCGTCGGCTCTGGTACAGGACATCGCGATGAATACGGCAATCCCAGGCAAGAGGGTATAATGGACAAGGTGAAAAATGCCGTAGGCATGGGCCCCAGTTCAGGAACCGGCTACAACAATCAGCCTGGTTATGACAATTACGGTAACCCAAGGCAAGAAGGATTAGTAGACAAGGCGAAGGACGCCGTGGGCATGGGTCCGAGTTTAGGAACTGGCTACAATAACCAGCCTGGTTATGACAGTTACGGGAATCGTGAGGGCATTGTGGACAGGGCGAAAGATGCGGTAGGGATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGGTACGACAATTACGGTGACCGAAGGCATGAAGGATTGGCAGACAGAGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACCACCAGCCTGGATATGACAACTACGGCAATCGTGAGGGCGTTGTGGACAAGGCGAAGGATGCGGTAGGCATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGTTATGACAGTTATGGTACCCGGAGACAGGAAGGATTGGTAGATAGAGCAAAGGATGCCGTCGGCATGGGCCCCAATTCGGGCACCGGCTATAACAATCAGCCCGGATATGACAACTACGGTAACCCAAGACGCGAAGGAGTGGTAGACAGGGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACAATCAGCCCGGATATGACAACTACGGCAATCGTGAGGGCATTGTGGACAAAGCCAAGGATGCAGTCGGTGTTGGCCCCCACTCGGGTACTGGCTACCACAACCAGCCCAGCTACGACAACTATGGCAACCCTAGGCAAGAGGGAATCGTGGATAGAGCGAAAGACGCTGTGGGGATGGGACCAAACTCTGGAACTGGCTACAACAACCAGTCTGATTATGACAGTTATGGCAACCCAAGGCACGAAGGCATGCTTGACAAGGCGAAGGATGACTTTGATATGGGCCCCAATTCCGGCACTGGCTATAACAACCGGCCCGGCTATGACACCTATGGGGACCGAAAACACGAGGGAATTGGTGACAAGGTGAGGGACGCAATCGGTACTGGCCCAAACTCCGGATATGACAGCCGCACACCCACCGGAACCGACGCTTACGTGCATGGCAACCATCCCCCTGGTATGCAAGACAGAATCACTGGCGTGAACGAGCCCTCGATCTTAGGTGGACGTGAGAATGTAGACCGCCATGGTTTTGGACACGATGGTCGCCAACATCACGGTCTGCTAGATAATGTTACTCTTCAAAGTGGCCATATTCCTGAGACTATGGTAGGCGGGCGCCGTGTTGAACCTGGATATGATATGACCAAGAGTGCTGGACATCATCTTACTGATCTTGGCCATCACGGTAACGATAGCGGTGTCACTGGATTGGGCCATCACGACACTGATTACGATGAGAGGAGGGGAAAAGGATTTGAAGACCCGATTGATAACAAAACCGGACTTGGATCAGACTACGATACGACCGAGACCGGATCTGGTTATGGTGCCACCGATACTGGTGCTGCACCTCACAAGAAGGGAATCATAACTAAGATCAAGGAGAAGCTGCACCACTAG", cds.getResidues());

		gene = createGene(-1);
		printGene(gene);
		System.out.println("gene (minus): " + gene.getResidues());
		assertEquals("gene residues (minus): ", "ATATCTTTTCTCACAATCGTTGCAGAGGACTTGTATGCACTTTAGACGTGGAAGAAGAATCGCGAGACTTTTCGGTGTGTCGGAGAGAGTGTTCATCGATCGTGCCTTTTGGCGTTAGGCGCGATTATGTCGCATGCTGTGTGAGTGTGTCTCTCTCGGCCACTGTAGGATGTTCGTGTCGATGCGAGTTTGTGAAATGCTAGGTCAATGTTGCTTGGTTCACAGTTTCGTACCTAGTTTGCGATCTGTCTGATTCGTTGTGTGGATGTAGAGAGCCTCTGGTGCGTAATGTAGGCTGGTTGGGACACATTTGACTTGTTCTGTAGGGTCGATCTGTCGATGGGGCTCTGGGTTTCCGATGTTTCTCCGTAGAGGGAGTTCTTCTGTATGTTTGTTTGTGGTTAGATCTGCTTTTGGAATCAATGAGCATTGCGAAGACTATTTCTCCTGCTAAAGAACTTTTCGATCGTCAAATAATTGTGATGATCTTTCTACCATTAAAGATTCCATTAGAGTCTTTGTTTGCCATGCATGTTTGGGATCGAGGATATTTGAAGCATACAGTGGTCTAATGTAGCGATTTCTTAACAACAATGCTTCCATTTCTTTTGCAGAGTATATAGAAATCATCGACAATCATGAATCAGTACGGAAGAGAACAGCAAGATACTGGCCTCGTCGGCTCTGGTACAGGTAATGAAATGTTTTTTTTGCGATTTTAAACACTGTTTTCCGTGGATTGATGATGAACGATCCTCAAAGGTCTTTTTTATTTTCGGCACGGAACCCCTCGCAATCTTTGGTGTAGCTCATTTGTTCTCGCTAACGATCCATCTTCTGATGGTGTAGGACATCGCGATGAATACGGCAATCCCAGGCAAGAGGGTATAATGGACAAGGTGAAAAATGCCGTAGGCATGGGCCCCAGTTCAGGAACCGGCTACAACAATCAGCCTGGTTATGACAATTACGGTAACCCAAGGCAAGAAGGATTAGTAGACAAGGCGAAGGACGCCGTGGGCATGGGTCCGAGTTTAGGAACTGGCTACAATAACCAGCCTGGTTATGACAGTTACGGGAATCGTGAGGGCATTGTGGACAGGGCGAAAGATGCGGTAGGGATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGGTACGACAATTACGGTGACCGAAGGCATGAAGGATTGGCAGACAGAGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACCACCAGCCTGGATATGACAACTACGGCAATCGTGAGGGCGTTGTGGACAAGGCGAAGGATGCGGTAGGCATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGTTATGACAGTTATGGTACCCGGAGACAGGAAGGATTGGTAGATAGAGCAAAGGATGCCGTCGGCATGGGCCCCAATTCGGGCACCGGCTATAACAATCAGCCCGGATATGACAACTACGGTAACCCAAGACGCGAAGGAGTGGTAGACAGGGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACAATCAGCCCGGATATGACAACTACGGCAATCGTGAGGGCATTGTGGACAAAGCCAAGGATGCAGTCGGTGTTGGCCCCCACTCGGGTACTGGCTACCACAACCAGCCCAGCTACGACAACTATGGCAACCCTAGGCAAGAGGGAATCGTGGATAGAGCGAAAGACGCTGTGGGGATGGGACCAAACTCTGGAACTGGCTACAACAACCAGTCTGATTATGACAGTTATGGCAACCCAAGGCACGAAGGCATGCTTGACAAGGCGAAGGATGACTTTGATATGGGCCCCAATTCCGGCACTGGCTATAACAACCGGCCCGGCTATGACACCTATGGGGACCGAAAACACGAGGGAATTGGTGACAAGGTGAGGGACGCAATCGGTACTGGCCCAAACTCCGGATATGACAGCCGCACACCCACCGGAACCGACGCTTACGTGCATGGCAACCATCCCCCTGGTATGCAAGACAGAATCACTGGCGTGAACGAGCCCTCGATCTTAGGTGGACGTGAGAATGTAGACCGCCATGGTTTTGGACACGATGGTCGCCAACATCACGGTCTGCTAGATAATGTTACTCTTCAAAGTGGCCATATTCCTGAGACTATGGTAGGCGGGCGCCGTGTTGAACCTGGATATGATATGACCAAGAGTGCTGGACATCATCGTGAGTCTACCATGCTATATCTTCTTGCAAATTATTTCGAAGTTTAGGCAGCTTGTTGAANTCTGCTAAATTGGTGGTGCTTCATGGTTTTGGAAAATCGGTGATTCCGCTGTTGTGGTGCTCATTCCTTCGTGTTAACTTGATTGATGGTAATGTGGTGTCGATGCAGTTACTGATCTTGGCCATCACGGTAACGATAGCGGTGTCACTGGATTGGGCCATCACGACACTGATTACGATGAGAGGAGGGGAAAAGGATTTGAAGACCCGATTGATAACAAAACCGGACTTGGATCAGACTACGATACGACCGAGACCGGATCTGGTTATGGTGCCACCGATACTGGTGCTGCACCTCACAAGAAGGGAATCATAACTAAGATCAAGGAGAAGCTGCACCACTAGAGAAGGAAGCGTAGTAATCTATCATGTAAATGGAGATTTGGTTTCTTGCAGAAACACCTGGTGTAATTTTTGTTTCATGAAATGTGAATATTTGAGTTTTTGTTAAT", gene.getResidues());
		transcript = gene.getTranscripts().iterator().next();
		System.out.println("transcript (minus): "  + transcript.getResidues());
		assertEquals("transcript residues (minus): ", "ATGAATCAGTACGGAAGAGAACAGCAAGATACTGGCCTCGTCGGCTCTGGTACAGGACATCGCGATGAATACGGCAATCCCAGGCAAGAGGGTATAATGGACAAGGTGAAAAATGCCGTAGGCATGGGCCCCAGTTCAGGAACCGGCTACAACAATCAGCCTGGTTATGACAATTACGGTAACCCAAGGCAAGAAGGATTAGTAGACAAGGCGAAGGACGCCGTGGGCATGGGTCCGAGTTTAGGAACTGGCTACAATAACCAGCCTGGTTATGACAGTTACGGGAATCGTGAGGGCATTGTGGACAGGGCGAAAGATGCGGTAGGGATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGGTACGACAATTACGGTGACCGAAGGCATGAAGGATTGGCAGACAGAGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACCACCAGCCTGGATATGACAACTACGGCAATCGTGAGGGCGTTGTGGACAAGGCGAAGGATGCGGTAGGCATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGTTATGACAGTTATGGTACCCGGAGACAGGAAGGATTGGTAGATAGAGCAAAGGATGCCGTCGGCATGGGCCCCAATTCGGGCACCGGCTATAACAATCAGCCCGGATATGACAACTACGGTAACCCAAGACGCGAAGGAGTGGTAGACAGGGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACAATCAGCCCGGATATGACAACTACGGCAATCGTGAGGGCATTGTGGACAAAGCCAAGGATGCAGTCGGTGTTGGCCCCCACTCGGGTACTGGCTACCACAACCAGCCCAGCTACGACAACTATGGCAACCCTAGGCAAGAGGGAATCGTGGATAGAGCGAAAGACGCTGTGGGGATGGGACCAAACTCTGGAACTGGCTACAACAACCAGTCTGATTATGACAGTTATGGCAACCCAAGGCACGAAGGCATGCTTGACAAGGCGAAGGATGACTTTGATATGGGCCCCAATTCCGGCACTGGCTATAACAACCGGCCCGGCTATGACACCTATGGGGACCGAAAACACGAGGGAATTGGTGACAAGGTGAGGGACGCAATCGGTACTGGCCCAAACTCCGGATATGACAGCCGCACACCCACCGGAACCGACGCTTACGTGCATGGCAACCATCCCCCTGGTATGCAAGACAGAATCACTGGCGTGAACGAGCCCTCGATCTTAGGTGGACGTGAGAATGTAGACCGCCATGGTTTTGGACACGATGGTCGCCAACATCACGGTCTGCTAGATAATGTTACTCTTCAAAGTGGCCATATTCCTGAGACTATGGTAGGCGGGCGCCGTGTTGAACCTGGATATGATATGACCAAGAGTGCTGGACATCATCTTACTGATCTTGGCCATCACGGTAACGATAGCGGTGTCACTGGATTGGGCCATCACGACACTGATTACGATGAGAGGAGGGGAAAAGGATTTGAAGACCCGATTGATAACAAAACCGGACTTGGATCAGACTACGATACGACCGAGACCGGATCTGGTTATGGTGCCACCGATACTGGTGCTGCACCTCACAAGAAGGGAATCATAACTAAGATCAAGGAGAAGCTGCACCACTAG", transcript.getResidues());
		cds = transcript.getCDS();
		System.out.println("cds (minus): " + cds.getResidues());
		System.out.println(cds.getResidues());
		System.out.println("ATGAATCAGTACGGAAGAGAACAGCAAGATACTGGCCTCGTCGGCTCTGGTACAGGACATCGCGATGAATACGGCAATCCCAGGCAAGAGGGTATAATGGACAAGGTGAAAAATGCCGTAGGCATGGGCCCCAGTTCAGGAACCGGCTACAACAATCAGCCTGGTTATGACAATTACGGTAACCCAAGGCAAGAAGGATTAGTAGACAAGGCGAAGGACGCCGTGGGCATGGGTCCGAGTTTAGGAACTGGCTACAATAACCAGCCTGGTTATGACAGTTACGGGAATCGTGAGGGCATTGTGGACAGGGCGAAAGATGCGGTAGGGATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGGTACGACAATTACGGTGACCGAAGGCATGAAGGATTGGCAGACAGAGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACCACCAGCCTGGATATGACAACTACGGCAATCGTGAGGGCGTTGTGGACAAGGCGAAGGATGCGGTAGGCATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGTTATGACAGTTATGGTACCCGGAGACAGGAAGGATTGGTAGATAGAGCAAAGGATGCCGTCGGCATGGGCCCCAATTCGGGCACCGGCTATAACAATCAGCCCGGATATGACAACTACGGTAACCCAAGACGCGAAGGAGTGGTAGACAGGGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACAATCAGCCCGGATATGACAACTACGGCAATCGTGAGGGCATTGTGGACAAAGCCAAGGATGCAGTCGGTGTTGGCCCCCACTCGGGTACTGGCTACCACAACCAGCCCAGCTACGACAACTATGGCAACCCTAGGCAAGAGGGAATCGTGGATAGAGCGAAAGACGCTGTGGGGATGGGACCAAACTCTGGAACTGGCTACAACAACCAGTCTGATTATGACAGTTATGGCAACCCAAGGCACGAAGGCATGCTTGACAAGGCGAAGGATGACTTTGATATGGGCCCCAATTCCGGCACTGGCTATAACAACCGGCCCGGCTATGACACCTATGGGGACCGAAAACACGAGGGAATTGGTGACAAGGTGAGGGACGCAATCGGTACTGGCCCAAACTCCGGATATGACAGCCGCACACCCACCGGAACCGACGCTTACGTGCATGGCAACCATCCCCCTGGTATGCAAGACAGAATCACTGGCGTGAACGAGCCCTCGATCTTAGGTGGACGTGAGAATGTAGACCGCCATGGTTTTGGACACGATGGTCGCCAACATCACGGTCTGCTAGATAATGTTACTCTTCAAAGTGGCCATATTCCTGAGACTATGGTAGGCGGGCGCCGTGTTGAACCTGGATATGATATGACCAAGAGTGCTGGACATCATCTTACTGATCTTGGCCATCACGGTAACGATAGCGGTGTCACTGGATTGGGCCATCACGACACTGATTACGATGAGAGGAGGGGAAAAGGATTTGAAGACCCGATTGATAACAAAACCGGACTTGGATCAGACTACGATACGACCGAGACCGGATCTGGTTATGGTGCCACCGATACTGGTGCTGCACCTCACAAGAAGGGAATCATAACTAAGATCAAGGAGAAGCTGCACCACTAG");
		assertEquals("cds residues (minus): ", "ATGAATCAGTACGGAAGAGAACAGCAAGATACTGGCCTCGTCGGCTCTGGTACAGGACATCGCGATGAATACGGCAATCCCAGGCAAGAGGGTATAATGGACAAGGTGAAAAATGCCGTAGGCATGGGCCCCAGTTCAGGAACCGGCTACAACAATCAGCCTGGTTATGACAATTACGGTAACCCAAGGCAAGAAGGATTAGTAGACAAGGCGAAGGACGCCGTGGGCATGGGTCCGAGTTTAGGAACTGGCTACAATAACCAGCCTGGTTATGACAGTTACGGGAATCGTGAGGGCATTGTGGACAGGGCGAAAGATGCGGTAGGGATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGGTACGACAATTACGGTGACCGAAGGCATGAAGGATTGGCAGACAGAGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACCACCAGCCTGGATATGACAACTACGGCAATCGTGAGGGCGTTGTGGACAAGGCGAAGGATGCGGTAGGCATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGTTATGACAGTTATGGTACCCGGAGACAGGAAGGATTGGTAGATAGAGCAAAGGATGCCGTCGGCATGGGCCCCAATTCGGGCACCGGCTATAACAATCAGCCCGGATATGACAACTACGGTAACCCAAGACGCGAAGGAGTGGTAGACAGGGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACAATCAGCCCGGATATGACAACTACGGCAATCGTGAGGGCATTGTGGACAAAGCCAAGGATGCAGTCGGTGTTGGCCCCCACTCGGGTACTGGCTACCACAACCAGCCCAGCTACGACAACTATGGCAACCCTAGGCAAGAGGGAATCGTGGATAGAGCGAAAGACGCTGTGGGGATGGGACCAAACTCTGGAACTGGCTACAACAACCAGTCTGATTATGACAGTTATGGCAACCCAAGGCACGAAGGCATGCTTGACAAGGCGAAGGATGACTTTGATATGGGCCCCAATTCCGGCACTGGCTATAACAACCGGCCCGGCTATGACACCTATGGGGACCGAAAACACGAGGGAATTGGTGACAAGGTGAGGGACGCAATCGGTACTGGCCCAAACTCCGGATATGACAGCCGCACACCCACCGGAACCGACGCTTACGTGCATGGCAACCATCCCCCTGGTATGCAAGACAGAATCACTGGCGTGAACGAGCCCTCGATCTTAGGTGGACGTGAGAATGTAGACCGCCATGGTTTTGGACACGATGGTCGCCAACATCACGGTCTGCTAGATAATGTTACTCTTCAAAGTGGCCATATTCCTGAGACTATGGTAGGCGGGCGCCGTGTTGAACCTGGATATGATATGACCAAGAGTGCTGGACATCATCTTACTGATCTTGGCCATCACGGTAACGATAGCGGTGTCACTGGATTGGGCCATCACGACACTGATTACGATGAGAGGAGGGGAAAAGGATTTGAAGACCCGATTGATAACAAAACCGGACTTGGATCAGACTACGATACGACCGAGACCGGATCTGGTTATGGTGCCACCGATACTGGTGCTGCACCTCACAAGAAGGGAATCATAACTAAGATCAAGGAGAAGCTGCACCACTAG", cds.getResidues());
	}
	
	public void testConvertLocalCoordinateToSourceCoordinate() {
		System.out.println("== testConvertLocalCoordinateToSourceCoordinate() ==");
		Gene gene = createGene(1);

		printGene(gene);
		assertEquals("genomic coordinate for gene coordinate 10 (plus): ", new Integer(10), new Integer(gene.convertLocalCoordinateToSourceCoordinate(10)));
		assertEquals("genomic coordinate for gene coordinate 3000 (plus): ", new Integer(-1), new Integer(gene.convertLocalCoordinateToSourceCoordinate(3000)));
		Transcript transcript = gene.getTranscripts().iterator().next();
		assertEquals("genomic coordinate for transcript coordinate 10 (plus): ", new Integer(648), new Integer(transcript.convertLocalCoordinateToSourceCoordinate(10)));
		assertEquals("genomic coordinate for transcript coordinate 60 (plus): ", new Integer(854), new Integer(transcript.convertLocalCoordinateToSourceCoordinate(60)));
		CDS cds = transcript.getCDS();
		assertEquals("genomic coordinate for cds coordinate 10 (plus): ", new Integer(648), new Integer(cds.convertLocalCoordinateToSourceCoordinate(10)));
		assertEquals("genomic coordinate for cds coordinate 60 (plus): ", new Integer(854), new Integer(cds.convertLocalCoordinateToSourceCoordinate(60)));
		cds.getFeatureLocation().setFmin(859);
		assertEquals("genomic coordinate for cds coordinate 10 (plus): ", new Integer(869), new Integer(cds.convertLocalCoordinateToSourceCoordinate(10)));
		assertEquals("genomic coordinate for cds coordinate 1374 (plus): ", new Integer(2402), new Integer(cds.convertLocalCoordinateToSourceCoordinate(1374)));
		
		gene = createGene(-1);
		assertEquals("genomic coordinate for gene coordinate 10 (minus): ", new Integer(10), new Integer(gene.convertLocalCoordinateToSourceCoordinate(2724)));
		assertEquals("genomic coordinate for gene coordinate 3000 (minus): ", new Integer(-1), new Integer(gene.convertLocalCoordinateToSourceCoordinate(3000)));
		transcript = gene.getTranscripts().iterator().next();
		assertEquals("genomic coordinate for transcript coordinate 10 (minus): ", new Integer(2086), new Integer(transcript.convertLocalCoordinateToSourceCoordinate(10)));
		assertEquals("genomic coordinate for transcript coordinate 60 (minus): ", new Integer(1880), new Integer(transcript.convertLocalCoordinateToSourceCoordinate(60)));
		cds = transcript.getCDS();
		assertEquals("genomic coordinate for cds coordinate 10 (minus): ", new Integer(2086), new Integer(cds.convertLocalCoordinateToSourceCoordinate(10)));
		assertEquals("genomic coordinate for cds coordinate 60 (minus): ", new Integer(1880), new Integer(cds.convertLocalCoordinateToSourceCoordinate(60)));
		cds.getFeatureLocation().setFmax(1876);
		assertEquals("genomic coordinate for cds coordinate 10 (minus): ", new Integer(1865), new Integer(cds.convertLocalCoordinateToSourceCoordinate(10)));
		assertEquals("genomic coordinate for cds coordinate 1374 (minus): ", new Integer(332), new Integer(cds.convertLocalCoordinateToSourceCoordinate(1374)));
	}
	
	public void testConvertSourceCoordinateToLocalCoordinate() {
		System.out.println("== testConvertSourceCoordinateToLocalCoordinate() ==");
		
		Gene gene = createGene(1);
		assertEquals("gene coordinate for genomic coordinate 10 (plus): ", new Integer(10), new Integer(gene.convertSourceCoordinateToLocalCoordinate(10)));
		assertEquals("gene coordinate for genomic coordinate 3000 (plus): ", new Integer(-1), new Integer(gene.convertSourceCoordinateToLocalCoordinate(3000)));
		Transcript transcript = gene.getTranscripts().iterator().next();
		assertEquals("transcript coordinate for genomic coordinate 648 (plus): ", new Integer(10), new Integer(transcript.convertSourceCoordinateToLocalCoordinate(648)));
		assertEquals("transcript coordinate for genomic coordinate 854 (plus): ", new Integer(60), new Integer(transcript.convertSourceCoordinateToLocalCoordinate(854)));
		CDS cds = transcript.getCDS();
		assertEquals("cds coordinate for genomic coordinate 648 (plus): ", new Integer(10), new Integer(cds.convertSourceCoordinateToLocalCoordinate(648)));
		assertEquals("cds coordinate for genomic coordinate 854 (plus): ", new Integer(60), new Integer(transcript.convertSourceCoordinateToLocalCoordinate(854)));
		cds.getFeatureLocation().setFmin(859);
		assertEquals("cds coordinate for genomic coordinate 869 (plus): ", new Integer(10), new Integer(cds.convertSourceCoordinateToLocalCoordinate(869)));
		assertEquals("cds coordinate for genomic coordinate 2402 (plus): ", new Integer(1374), new Integer(cds.convertSourceCoordinateToLocalCoordinate(2402)));
		
		gene = createGene(-1);
		printGene(gene);
		assertEquals("gene coordinate for genomic coordinate 2724 (minus): ", new Integer(10), new Integer(gene.convertSourceCoordinateToLocalCoordinate(2724)));
		assertEquals("gene coordinate for genomic coordinate 3000 (minus): ", new Integer(-1), new Integer(gene.convertSourceCoordinateToLocalCoordinate(3000)));
		transcript = gene.getTranscripts().iterator().next();
		assertEquals("transcript coordinate for genomic coordinate 2086 (minus): ", new Integer(10), new Integer(transcript.convertSourceCoordinateToLocalCoordinate(2086)));
		assertEquals("transcript coordinate for genomic coordinate 1880 (minus): ", new Integer(60), new Integer(transcript.convertSourceCoordinateToLocalCoordinate(1880)));
		cds = transcript.getCDS();
		assertEquals("cds coordinate for genomic coordinate 2086 (minus): ", new Integer(10), new Integer(cds.convertSourceCoordinateToLocalCoordinate(2086)));
		assertEquals("cds coordinate for genomic coordinate 1880 (minus): ", new Integer(60), new Integer(cds.convertSourceCoordinateToLocalCoordinate(1880)));
		cds.getFeatureLocation().setFmax(1876);
		assertEquals("cds coordinate for genomic coordinate 1865 (minus): ", new Integer(10), new Integer(cds.convertSourceCoordinateToLocalCoordinate(1865)));
		assertEquals("cds coordinate for genomic coordinate 332 (minus): ", new Integer(1374), new Integer(cds.convertSourceCoordinateToLocalCoordinate(332)));
	}
	
	public void testTranscriptGetFrameshifts() {
		System.out.println("== testTranscriptGetFrameshift() ==");
		
		Gene gene = createGene(1);
		Transcript transcript = gene.getTranscripts().iterator().next();
		transcript.addFrameshift(new Plus1Frameshift(transcript, 641, conf));
		transcript.addFrameshift(new Plus2Frameshift(transcript, 850, conf));
		transcript.addFrameshift(new Minus1Frameshift(transcript, 2394, conf));
		transcript.addFrameshift(new Minus2Frameshift(transcript, 2500, conf));
		
		Collection<? extends Frameshift> frameshifts = transcript.getFrameshifts();
		assertEquals("Number of frameshifts: ", new Integer(4), new Integer(frameshifts.size()));
	}
	
	public void testTranscriptDeleteFrameshift() {
		System.out.println("== testTranscriptDeleteFrameshift() ==");
		
		Gene gene = createGene(1);
		Transcript transcript = gene.getTranscripts().iterator().next();
		transcript.addFrameshift(new Plus1Frameshift(transcript, 641, conf));
		transcript.addFrameshift(new Plus2Frameshift(transcript, 850, conf));
		transcript.addFrameshift(new Minus1Frameshift(transcript, 2394, conf));
		transcript.addFrameshift(new Minus2Frameshift(transcript, 2500, conf));
		
		assertEquals("Number of frameshifts (before delete): ", new Integer(4), new Integer(transcript.getFrameshifts().size()));
		transcript.deleteFrameshift(new Plus1Frameshift(transcript, 641, conf));
		transcript.deleteFrameshift(new Minus2Frameshift(transcript, 2500, conf));
		assertEquals("Number of frameshifts (after delete): ", new Integer(2), new Integer(transcript.getFrameshifts().size()));
	}
	
	public void testGetChildren() {
		System.out.println("== testGetChildren() ==");
		Gene gene = createGene(1);
		Collection<? extends AbstractSingleLocationBioFeature> geneChildren = gene.getChildren();
		assertEquals("Number of children for gene: ", new Integer(1), new Integer(geneChildren.size()));
		System.out.println(geneChildren);
		Transcript transcript = gene.getTranscripts().iterator().next();
		Collection<? extends AbstractSingleLocationBioFeature> transcriptChildren = transcript.getChildren();
		assertEquals("Number of children for transcript: ", new Integer(4), new Integer(transcriptChildren.size()));
		System.out.println(transcriptChildren);
	}
	
	private Chromosome createChromosome(int strand) {
		Chromosome chromosome = new Chromosome(organism, "chromosome", false, false, new Timestamp(0), conf);
		if (strand == -1) {
			chromosome.setResidues("ATTAACAAAAACTCAAATATTCACATTTCATGAAACAAAAATTACACCAGGTGTTTCTGCAAGAAACCAAATCTCCATTTACATGATAGATTACTACGCTTCCTTCTCTAGTGGTGCAGCTTCTCCTTGATCTTAGTTATGATTCCCTTCTTGTGAGGTGCAGCACCAGTATCGGTGGCACCATAACCAGATCCGGTCTCGGTCGTATCGTAGTCTGATCCAAGTCCGGTTTTGTTATCAATCGGGTCTTCAAATCCTTTTCCCCTCCTCTCATCGTAATCAGTGTCGTGATGGCCCAATCCAGTGACACCGCTATCGTTACCGTGATGGCCAAGATCAGTAACTGCATCGACACCACATTACCATCAATCAAGTTAACACGAAGGAATGAGCACCACAACAGCGGAATCACCGATTTTCCAAAACCATGAAGCACCACCAATTTAGCAGANTTCAACAAGCTGCCTAAACTTCGAAATAATTTGCAAGAAGATATAGCATGGTAGACTCACGATGATGTCCAGCACTCTTGGTCATATCATATCCAGGTTCAACACGGCGCCCGCCTACCATAGTCTCAGGAATATGGCCACTTTGAAGAGTAACATTATCTAGCAGACCGTGATGTTGGCGACCATCGTGTCCAAAACCATGGCGGTCTACATTCTCACGTCCACCTAAGATCGAGGGCTCGTTCACGCCAGTGATTCTGTCTTGCATACCAGGGGGATGGTTGCCATGCACGTAAGCGTCGGTTCCGGTGGGTGTGCGGCTGTCATATCCGGAGTTTGGGCCAGTACCGATTGCGTCCCTCACCTTGTCACCAATTCCCTCGTGTTTTCGGTCCCCATAGGTGTCATAGCCGGGCCGGTTGTTATAGCCAGTGCCGGAATTGGGGCCCATATCAAAGTCATCCTTCGCCTTGTCAAGCATGCCTTCGTGCCTTGGGTTGCCATAACTGTCATAATCAGACTGGTTGTTGTAGCCAGTTCCAGAGTTTGGTCCCATCCCCACAGCGTCTTTCGCTCTATCCACGATTCCCTCTTGCCTAGGGTTGCCATAGTTGTCGTAGCTGGGCTGGTTGTGGTAGCCAGTACCCGAGTGGGGGCCAACACCGACTGCATCCTTGGCTTTGTCCACAATGCCCTCACGATTGCCGTAGTTGTCATATCCGGGCTGATTGTTGTAACCTGAGTTAGGCCCCATACCTACAGCATCCTTCGCCCTGTCTACCACTCCTTCGCGTCTTGGGTTACCGTAGTTGTCATATCCGGGCTGATTGTTATAGCCGGTGCCCGAATTGGGGCCCATGCCGACGGCATCCTTTGCTCTATCTACCAATCCTTCCTGTCTCCGGGTACCATAACTGTCATAACCAGGCTGGTTGTTGTAGCCAGTTCCTGAATTCGGACCCATGCCTACCGCATCCTTCGCCTTGTCCACAACGCCCTCACGATTGCCGTAGTTGTCATATCCAGGCTGGTGGTTGTAACCTGAGTTAGGCCCCATACCTACAGCATCCTTCGCTCTGTCTGCCAATCCTTCATGCCTTCGGTCACCGTAATTGTCGTACCCAGGCTGGTTGTTGTAGCCAGTTCCTGAATTCGGACCCATCCCTACCGCATCTTTCGCCCTGTCCACAATGCCCTCACGATTCCCGTAACTGTCATAACCAGGCTGGTTATTGTAGCCAGTTCCTAAACTCGGACCCATGCCCACGGCGTCCTTCGCCTTGTCTACTAATCCTTCTTGCCTTGGGTTACCGTAATTGTCATAACCAGGCTGATTGTTGTAGCCGGTTCCTGAACTGGGGCCCATGCCTACGGCATTTTTCACCTTGTCCATTATACCCTCTTGCCTGGGATTGCCGTATTCATCGCGATGTCCTACACCATCAGAAGATGGATCGTTAGCGAGAACAAATGAGCTACACCAAAGATTGCGAGGGGTTCCGTGCCGAAAATAAAAAAGACCTTTGAGGATCGTTCATCATCAATCCACGGAAAACAGTGTTTAAAATCGCAAAAAAAACATTTCATTACCTGTACCAGAGCCGACGAGGCCAGTATCTTGCTGTTCTCTTCCGTACTGATTCATGATTGTCGATGATTTCTATATACTCTGCAAAAGAAATGGAAGCATTGTTGTTAAGAAATCGCTACATTAGACCACTGTATGCTTCAAATATCCTCGATCCCAAACATGCATGGCAAACAAAGACTCTAATGGAATCTTTAATGGTAGAAAGATCATCACAATTATTTGACGATCGAAAAGTTCTTTAGCAGGAGAAATAGTCTTCGCAATGCTCATTGATTCCAAAAGCAGATCTAACCACAAACAAACATACAGAAGAACTCCCTCTACGGAGAAACATCGGAAACCCAGAGCCCCATCGACAGATCGACCCTACAGAACAAGTCAAATGTGTCCCAACCAGCCTACATTACGCACCAGAGGCTCTCTACATCCACACAACGAATCAGACAGATCGCAAACTAGGTACGAAACTGTGAACCAAGCAACATTGACCTAGCATTTCACAAACTCGCATCGACACGAACATCCTACAGTGGCCGAGAGAGACACACTCACACAGCATGCGACATAATCGCGCCTAACGCCAAAAGGCACGATCGATGAACACTCTCTCCGACACACCGAAAAGTCTCGCGATTCTTCTTCCACGTCTAAAGTGCATACAAGTCCTCTGCAACGATTGTGAGAAAAGATAT");
		}
		else {
			chromosome.setResidues("ATATCTTTTCTCACAATCGTTGCAGAGGACTTGTATGCACTTTAGACGTGGAAGAAGAATCGCGAGACTTTTCGGTGTGTCGGAGAGAGTGTTCATCGATCGTGCCTTTTGGCGTTAGGCGCGATTATGTCGCATGCTGTGTGAGTGTGTCTCTCTCGGCCACTGTAGGATGTTCGTGTCGATGCGAGTTTGTGAAATGCTAGGTCAATGTTGCTTGGTTCACAGTTTCGTACCTAGTTTGCGATCTGTCTGATTCGTTGTGTGGATGTAGAGAGCCTCTGGTGCGTAATGTAGGCTGGTTGGGACACATTTGACTTGTTCTGTAGGGTCGATCTGTCGATGGGGCTCTGGGTTTCCGATGTTTCTCCGTAGAGGGAGTTCTTCTGTATGTTTGTTTGTGGTTAGATCTGCTTTTGGAATCAATGAGCATTGCGAAGACTATTTCTCCTGCTAAAGAACTTTTCGATCGTCAAATAATTGTGATGATCTTTCTACCATTAAAGATTCCATTAGAGTCTTTGTTTGCCATGCATGTTTGGGATCGAGGATATTTGAAGCATACAGTGGTCTAATGTAGCGATTTCTTAACAACAATGCTTCCATTTCTTTTGCAGAGTATATAGAAATCATCGACAATCATGAATCAGTACGGAAGAGAACAGCAAGATACTGGCCTCGTCGGCTCTGGTACAGGTAATGAAATGTTTTTTTTGCGATTTTAAACACTGTTTTCCGTGGATTGATGATGAACGATCCTCAAAGGTCTTTTTTATTTTCGGCACGGAACCCCTCGCAATCTTTGGTGTAGCTCATTTGTTCTCGCTAACGATCCATCTTCTGATGGTGTAGGACATCGCGATGAATACGGCAATCCCAGGCAAGAGGGTATAATGGACAAGGTGAAAAATGCCGTAGGCATGGGCCCCAGTTCAGGAACCGGCTACAACAATCAGCCTGGTTATGACAATTACGGTAACCCAAGGCAAGAAGGATTAGTAGACAAGGCGAAGGACGCCGTGGGCATGGGTCCGAGTTTAGGAACTGGCTACAATAACCAGCCTGGTTATGACAGTTACGGGAATCGTGAGGGCATTGTGGACAGGGCGAAAGATGCGGTAGGGATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGGTACGACAATTACGGTGACCGAAGGCATGAAGGATTGGCAGACAGAGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACCACCAGCCTGGATATGACAACTACGGCAATCGTGAGGGCGTTGTGGACAAGGCGAAGGATGCGGTAGGCATGGGTCCGAATTCAGGAACTGGCTACAACAACCAGCCTGGTTATGACAGTTATGGTACCCGGAGACAGGAAGGATTGGTAGATAGAGCAAAGGATGCCGTCGGCATGGGCCCCAATTCGGGCACCGGCTATAACAATCAGCCCGGATATGACAACTACGGTAACCCAAGACGCGAAGGAGTGGTAGACAGGGCGAAGGATGCTGTAGGTATGGGGCCTAACTCAGGTTACAACAATCAGCCCGGATATGACAACTACGGCAATCGTGAGGGCATTGTGGACAAAGCCAAGGATGCAGTCGGTGTTGGCCCCCACTCGGGTACTGGCTACCACAACCAGCCCAGCTACGACAACTATGGCAACCCTAGGCAAGAGGGAATCGTGGATAGAGCGAAAGACGCTGTGGGGATGGGACCAAACTCTGGAACTGGCTACAACAACCAGTCTGATTATGACAGTTATGGCAACCCAAGGCACGAAGGCATGCTTGACAAGGCGAAGGATGACTTTGATATGGGCCCCAATTCCGGCACTGGCTATAACAACCGGCCCGGCTATGACACCTATGGGGACCGAAAACACGAGGGAATTGGTGACAAGGTGAGGGACGCAATCGGTACTGGCCCAAACTCCGGATATGACAGCCGCACACCCACCGGAACCGACGCTTACGTGCATGGCAACCATCCCCCTGGTATGCAAGACAGAATCACTGGCGTGAACGAGCCCTCGATCTTAGGTGGACGTGAGAATGTAGACCGCCATGGTTTTGGACACGATGGTCGCCAACATCACGGTCTGCTAGATAATGTTACTCTTCAAAGTGGCCATATTCCTGAGACTATGGTAGGCGGGCGCCGTGTTGAACCTGGATATGATATGACCAAGAGTGCTGGACATCATCGTGAGTCTACCATGCTATATCTTCTTGCAAATTATTTCGAAGTTTAGGCAGCTTGTTGAANTCTGCTAAATTGGTGGTGCTTCATGGTTTTGGAAAATCGGTGATTCCGCTGTTGTGGTGCTCATTCCTTCGTGTTAACTTGATTGATGGTAATGTGGTGTCGATGCAGTTACTGATCTTGGCCATCACGGTAACGATAGCGGTGTCACTGGATTGGGCCATCACGACACTGATTACGATGAGAGGAGGGGAAAAGGATTTGAAGACCCGATTGATAACAAAACCGGACTTGGATCAGACTACGATACGACCGAGACCGGATCTGGTTATGGTGCCACCGATACTGGTGCTGCACCTCACAAGAAGGGAATCATAACTAAGATCAAGGAGAAGCTGCACCACTAGAGAAGGAAGCGTAGTAATCTATCATGTAAATGGAGATTTGGTTTCTTGCAGAAACACCTGGTGTAATTTTTGTTTCATGAAATGTGAATATTTGAGTTTTTGTTAAT");
		}
		return chromosome;
	}
	
	private Gene createGene(int strand) {
		Chromosome chromosome = createChromosome(strand);
		chromosome.setFeatureLocation(0, 2735, 1, null);
		Gene gene = new Gene(organism, "gene", false, false, new Timestamp(0), conf);
		gene.setFeatureLocation(0, 2735, strand, chromosome);
		Transcript transcript = createTranscript(638, 2628, strand, "transcript", chromosome);
		gene.addTranscript(transcript);
		transcript.addExon(createExon(638, 693, strand, "exon1", chromosome));
		transcript.addExon(createExon(849, 2223, strand, "exon2", chromosome));
		transcript.addExon(createExon(2392, 2628, strand, "exon3", chromosome));
		CDS cds = createCDS(638, 2628, strand, "cds", chromosome);
		transcript.setCDS(cds);
		return gene;
	}

	private Transcript createTranscript(int fmin, int fmax, int strand, String name, Chromosome src) {
		Transcript transcript = new Transcript(organism, name, false, false, new Timestamp(0), conf);
		if (strand == -1) {
			int tmp = fmax;
			fmax = src.getLength() - fmin;
			fmin = src.getLength() - tmp;
		}
		transcript.setFeatureLocation(fmin, fmax, strand, src);
		return transcript;
	}
	
	private Exon createExon(int fmin, int fmax, int strand, String name, Chromosome src) {
		Exon exon = new Exon(organism, name, false, false, new Timestamp(0), conf);
		if (strand == -1) {
			int tmp = fmax;
			fmax = src.getLength() - fmin;
			fmin = src.getLength() - tmp;
		}
		exon.setFeatureLocation(fmin, fmax, strand, src);
		return exon;
	}
	
	private CDS createCDS(int fmin, int fmax, int strand, String name, Chromosome src) {
		CDS cds = new CDS(organism, name, false, false, new Timestamp(0), conf);
		if (strand == -1) {
			int tmp = fmax;
			fmax = src.getLength() - fmin;
			fmin = src.getLength() - tmp;
		}
		cds.setFeatureLocation(fmin, fmax, strand, src);
		return cds;
	}
	
	private void printGene(Gene gene) {
		printFeatureInfo(gene, 0);
		for (Transcript transcript : gene.getTranscripts()) {
			printFeatureInfo(transcript, 1);
			if (transcript.getCDS() != null) {
				printFeatureInfo(transcript.getCDS(), 1);
			}
			for (Exon exon : transcript.getExons()) {
				printFeatureInfo(exon, 2);
			}
		}
	}
	
	private void printFeatureInfo(AbstractSingleLocationBioFeature feature, int indent)
	{
		for (int i = 0; i < indent; ++i) {
			System.out.print("\t");
		}
		System.out.printf("%s\t(%d,%d,%d)%n", feature.getUniqueName(), feature.getFeatureLocation().getFmin(),
				feature.getFeatureLocation().getFmax(), feature.getFeatureLocation().getStrand());
	}

}
