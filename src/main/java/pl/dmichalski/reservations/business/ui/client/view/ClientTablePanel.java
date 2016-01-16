package pl.dmichalski.reservations.business.ui.client.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.dmichalski.reservations.business.ui.client.model.ClientTableModel;

import javax.swing.*;
import java.awt.*;

@Component
public class ClientTablePanel extends JPanel {

    private ClientTableModel clientTableModel;

    private JTable clientTable;

    @Autowired
    ClientTablePanel(ClientTableModel clientTableModel) {
        this.clientTableModel = clientTableModel;
        setUpPanel();
        initComponents();
    }

    private void setUpPanel() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        clientTable = new JTable(clientTableModel);
        clientTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneWithTable = new JScrollPane(clientTable);
        add(paneWithTable, BorderLayout.CENTER);
    }

    public JTable getClientTable() {
        return clientTable;
    }

}