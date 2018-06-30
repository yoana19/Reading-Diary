package edu_school;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.DropMode;
import java.awt.Color;

public class readingdiary extends JFrame {

	private JPanel contentPane;
	private JTextArea genre;
	private JTextArea title;
	private JLabel lblGenre;
	private JLabel lblAuthor;
	private JLabel lblPages;
	private JTextField pages;
	private JTextArea summary;
	private JLabel lblSummary;
	private JLabel lblOpinion;
	private JTextArea opinion;
	private JButton btnDown;
	private JLabel lblCharacters;
	private JTextArea characters;
	private JLabel lblDate1;
	private JLabel lblDate2;
	private JTextField date1;
	private JTextField date2;
	private JScrollPane scrollPane_1;
	private JTextArea author;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JScrollPane scrollPane_5;
	private JLabel lblRating;
	private JTextField rating;
	private JLabel rating1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_6;
	private JLabel label;
	private JTextArea quotes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					readingdiary frame = new readingdiary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public readingdiary() {
		setTitle("Reading Diary");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 638);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(6, 32, 61, 16);
		contentPane.add(lblTitle);
		
		
		btnDown = new JButton("Download");
		btnDown.setBounds(134, 581, 373, 29);
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showSaveDialog(contentPane);
				try {
					BufferedWriter out = new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream(
											fc.getSelectedFile().getPath()
											), 
									"UTF-8")
							);
					out.write("Title: " + "\n" + title.getText() + "\n\n");
					out.write("Author: " + "\n" + author.getText() + "\n\n");
					out.write("Genre: " + "\n" + genre.getText() + "\n\n");
					out.write("Number of Pages: " + "\n" + pages.getText() + "\n\n");
					out.write("Date Started: " + "\n" + date1.getText() + "\n\n");
					out.write("Date Finished: " + "\n" + date2.getText() + "\n\n");
					out.write("Rating: " + "\n" + rating.getText() + "/5" + "\n\n");
					out.write("Characters: " + "\n" + characters.getText() + "\n\n");
					out.write("Summary: " + "\n" + summary.getText() + "\n\n");
					out.write("Quotes: " + "\n" + quotes.getText() + "\n\n");
					out.write("Opinion: " + "\n" +  opinion.getText() + "\n\n");
					
					out.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnDown);
		
		lblGenre = new JLabel("Genre:");
		lblGenre.setBounds(6, 174, 61, 16);
		contentPane.add(lblGenre);
		
		lblAuthor = new JLabel("Author:");
		lblAuthor.setBounds(6, 107, 61, 16);
		contentPane.add(lblAuthor);
		
		lblPages = new JLabel("Number of Pages:");
		lblPages.setBounds(6, 246, 117, 16);
		contentPane.add(lblPages);
		
		pages = new JTextField();
		pages.setBounds(135, 241, 61, 26);
		contentPane.add(pages);
		pages.setColumns(10);
		
		lblSummary = new JLabel("Summary:");
		lblSummary.setBounds(350, 32, 84, 16);
		contentPane.add(lblSummary);
		
		lblOpinion = new JLabel("Opinion:");
		lblOpinion.setBounds(350, 425, 84, 16);
		contentPane.add(lblOpinion);
		
		lblCharacters = new JLabel("Characters:");
		lblCharacters.setBounds(6, 425, 84, 16);
		contentPane.add(lblCharacters);
		
		lblDate1 = new JLabel("Date Started:");
		lblDate1.setBounds(6, 292, 92, 16);
		contentPane.add(lblDate1);
		
		lblDate2 = new JLabel("Date Finished:");
		lblDate2.setBounds(6, 339, 92, 16);
		contentPane.add(lblDate2);
		
		date1 = new JTextField();
		date1.setBounds(110, 287, 86, 26);
		date1.setColumns(10);
		contentPane.add(date1);
		
		date2 = new JTextField();
		date2.setBounds(110, 334, 86, 26);
		date2.setColumns(10);
		contentPane.add(date2);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 57, 282, 27);
		contentPane.add(scrollPane);
		scrollPane.setVisible(true);
		
		title = new JTextArea();
		scrollPane.setViewportView(title);
		title.setWrapStyleWord(true);
		title.setLineWrap(true);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 135, 282, 27);
		contentPane.add(scrollPane_1);
		
		author = new JTextArea();
		author.setWrapStyleWord(true);
		author.setLineWrap(true);
		scrollPane_1.setViewportView(author);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(6, 202, 282, 27);
		contentPane.add(scrollPane_2);
		
		genre = new JTextArea();
		scrollPane_2.setViewportView(genre);
		genre.setWrapStyleWord(true);
		genre.setLineWrap(true);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(6, 453, 282, 116);
		contentPane.add(scrollPane_3);
		
		characters = new JTextArea();
		scrollPane_3.setViewportView(characters);
		characters.setWrapStyleWord(true);
		characters.setLineWrap(true);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(350, 57, 282, 205);
		contentPane.add(scrollPane_4);
		
		
		summary = new JTextArea();
		scrollPane_4.setViewportView(summary);
		summary.setWrapStyleWord(true);
		summary.setLineWrap(true);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(350, 453, 282, 116);
		contentPane.add(scrollPane_5);
		
		opinion = new JTextArea();
		scrollPane_5.setViewportView(opinion);
		opinion.setWrapStyleWord(true);
		opinion.setLineWrap(true);
		
		lblRating = new JLabel("Rating:");
		lblRating.setBounds(6, 383, 46, 16);
		contentPane.add(lblRating);
		
		rating = new JTextField();
		rating.setColumns(10);
		rating.setBounds(64, 378, 26, 26);
		contentPane.add(rating);
		
		rating1 = new JLabel("/5");
		rating1.setBounds(90, 383, 26, 16);
		contentPane.add(rating1);
		
		scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(350, 297, 282, 116);
		contentPane.add(scrollPane_6);
		
		quotes = new JTextArea();
		quotes.setLineWrap(true);
		quotes.setWrapStyleWord(true);
		scrollPane_6.setViewportView(quotes);
		
		label = new JLabel("Quotes:");
		label.setBounds(350, 269, 84, 16);
		contentPane.add(label);
	}
}
