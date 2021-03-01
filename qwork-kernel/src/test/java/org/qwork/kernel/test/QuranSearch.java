package org.qwork.kernel.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import org.qwork.kernel.search.QSearchService;

public class QuranSearch {

	private JFrame frmQuranSearch;
	private final JButton btnSearch = new JButton("Search");
	private final JTextArea textAreaSearchResult = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuranSearch window = new QuranSearch();
					window.frmQuranSearch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuranSearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuranSearch = new JFrame();
		frmQuranSearch.setTitle("Quran search");
		frmQuranSearch.setBounds(100, 100, 505, 461);
		frmQuranSearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuranSearch.getContentPane().setLayout(new BoxLayout(frmQuranSearch.getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel lblPutTheTextToSearch = new JLabel("Put the text to search:");
		lblPutTheTextToSearch.setHorizontalAlignment(SwingConstants.LEFT);
		frmQuranSearch.getContentPane().add(lblPutTheTextToSearch);
		
		JTextArea textAreaSearchInput = new JTextArea();
		frmQuranSearch.getContentPane().add(textAreaSearchInput);
		btnSearch.setHorizontalAlignment(SwingConstants.LEFT);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var res = QSearchService.search(textAreaSearchInput.getText(), 50);
				textAreaSearchResult.setText(res.toString());
			}
		});
		frmQuranSearch.getContentPane().add(btnSearch);
		textAreaSearchResult.setEditable(false);
		frmQuranSearch.getContentPane().add(textAreaSearchResult);
	}

}
