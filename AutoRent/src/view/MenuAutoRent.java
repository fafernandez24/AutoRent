/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import static control.MenuOrganizatorControl.CreateTournament;
import static control.MenuOrganizatorControl.GetUpTournamentFromPartOne;
import static control.MenuOrganizatorControl.changeButtonColor;
import static control.MenuOrganizatorControl.changePanelColor;
import static control.MenuOrganizatorControl.loadTournamentTypeFive;
import static control.MenuOrganizatorControl.loadTournamentTypeFour;
import static control.MenuOrganizatorControl.loadTournamentTypeOne;
import static control.MenuOrganizatorControl.loadTournamentTypeThree;
import static control.MenuOrganizatorControl.loadTournamentTypeTwo;
import static control.MenuOrganizatorControl.loadTournamentTypeZero;
import static control.MenuOrganizatorControl.organizatorFocusGained;
import static control.MenuOrganizatorControl.organizatorFocusLost;
import static control.MenuOrganizatorControl.organizatorGetNumberOfGroupsJComboBox;
import static control.MenuOrganizatorControl.organizatorSeeTournament;
import static control.MenuOrganizatorControl.organizatorShowPlayerInformation;
import static control.MenuOrganizatorControl.organizatorTabbedPanelSeeTournaments;
import static control.MenuOrganizatorControl.readPlayerListTournament;
import static control.MenuOrganizatorControl.whichTournamentShow;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Organizator;
import model.Double;
import model.Player;
import model.Tournament;


public class MenuAutoRent extends javax.swing.JFrame {
    
    
    // Atributtes
    
    
    
    private int opcionCrearTorneo = 0; // 1: single, 2: dobles, 3: equipos
    private Organizator organizator;
    private Tournament newTournament = new Tournament();
    
    // ManejarTablas
    
    private DefaultTableModel tablaJugadoresIngresados;
    private Object[] cellsSingle = new Object[4];
    
    private DefaultTableModel tablaDuplasIngresados;
    private Object[] cellsDoubles = new Object[6];
    
    private DefaultTableModel tablaPlayers = new DefaultTableModel();
    private Object[] playerCells;
    
    //////////////////

    /**
     * Creates new form Organizator
     */
    public MenuAutoRent(Organizator organizator) {
        this.organizator = organizator;
        this.setUndecorated(true);
        initComponents();
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        tablaJugadoresIngresados = (DefaultTableModel) tablaJugadoresAgregados.getModel();
        tablaDuplasIngresados = (DefaultTableModel) tablaDuplasAgregadas.getModel();
        this.newIcon();
        visual(tablaEnfrentamientos);
    }

    private void newIcon(){
        Image icon = new ImageIcon(getClass().getResource("/images/logoTamanacoSinFuego.png")).getImage();
        this.setIconImage(icon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonSalida = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        iconoSuperior = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        botonMenuVerTorneos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pestania = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        botonCrearTorneoDoble = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        botonCrearTorneoEquipo = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        botonCrearTorneoSingle = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        verTorneo2 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        verTorneo3 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        verTorneo1 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        botonCrearTorneoDoble3 = new javax.swing.JPanel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        botonCrearTorneoEquipo3 = new javax.swing.JPanel();
        jLabel168 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        botonCrearTorneoSingle3 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        botonCrearTorneoDoble4 = new javax.swing.JPanel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        botonCrearTorneoEquipo4 = new javax.swing.JPanel();
        jLabel182 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        botonCrearTorneoSingle4 = new javax.swing.JPanel();
        jLabel185 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        botonCrearTorneoDoble5 = new javax.swing.JPanel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        botonCrearTorneoEquipo5 = new javax.swing.JPanel();
        jLabel196 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        botonCrearTorneoSingle5 = new javax.swing.JPanel();
        jLabel199 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        botonCrearTorneoDoble6 = new javax.swing.JPanel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        botonCrearTorneoEquipo6 = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        botonCrearTorneoSingle6 = new javax.swing.JPanel();
        jLabel213 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        botonCrearTorneoDoble7 = new javax.swing.JPanel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        botonCrearTorneoEquipo7 = new javax.swing.JPanel();
        jLabel224 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        botonCrearTorneoSingle7 = new javax.swing.JPanel();
        jLabel227 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        botonCrearTorneoDoble8 = new javax.swing.JPanel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        botonCrearTorneoEquipo8 = new javax.swing.JPanel();
        jLabel238 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        botonCrearTorneoSingle8 = new javax.swing.JPanel();
        jLabel241 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        botonBuscarJugador = new javax.swing.JButton();
        textoBuscarJugador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        IconoCalendario1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        mostrarNombre = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel32 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        pestaniaCrearTorneoInicio = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        entradaNombreTorneo = new javax.swing.JTextField();
        pestaniaCrearTorneoInicio1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        entradaCostoTorneo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        entradaCantidadJugadores = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        botonSeguirIngresarDatosTorneo = new javax.swing.JButton();
        botonRegresarIngresarDatosTorneo = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        ingresarRondaEliminacionDirecta = new javax.swing.JComboBox<>();
        ingresarRondaEliminacionDirecta3 = new javax.swing.JComboBox<>();
        jLabel91 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        entradaNombreJugador = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        entradaIDJugador = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        entradaNumeroTelefonoJugador = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        entradaEmailJugador = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        entradaEquipoJugador = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        entradaFechaNacimientoJugador = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados = new javax.swing.JTable();
        botonSubirFotoJugador = new javax.swing.JButton();
        botonRegresarIngresarDatosSingle = new javax.swing.JButton();
        botonAgregarJugador = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        botonSeguirIngresarJugador = new javax.swing.JButton();
        opcionesCategoriaJugador = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        entradaNombreJugadorA = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        entradaIdJugadorA = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        entradaNumeroTelefonoJugadorA = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        entradaEmailJugadorA = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        entradaEquipoJugadorA = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        entradaFechaNacimientoJugadorA = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        botonFotoJugadorA = new javax.swing.JButton();
        botonRegresarIngresarDatosDobles = new javax.swing.JButton();
        botonAgregarJugadoresDupla = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        botonSeguirDuplas = new javax.swing.JButton();
        jSeparator29 = new javax.swing.JSeparator();
        entradaNombreJugadorB = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        entradaIdJugadorB = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jSeparator31 = new javax.swing.JSeparator();
        entradaNumeroTelefonoJugadorB = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        entradaEmailJugadorB = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        entradaEquipoJugadorB = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        entradaFechaNacimientoJugadorB = new javax.swing.JTextField();
        botonFotoJugadorB = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        opcionesCategoriaJugadorA = new javax.swing.JComboBox<>();
        opcionesCategoriaJugadorB = new javax.swing.JComboBox<>();
        jScrollPane37 = new javax.swing.JScrollPane();
        tablaDuplasAgregadas = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        entradaNombreCapitan = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        entradaCedulaCapitan = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        entradaNumeroTelefonoCapitan = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jSeparator38 = new javax.swing.JSeparator();
        entradaCorreoCapitan = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jSeparator41 = new javax.swing.JSeparator();
        entradaNombreEquipo = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        botonFotoCapitan = new javax.swing.JButton();
        botonRegresarIngresarDatosEquipo = new javax.swing.JButton();
        botonAgregarEquipo = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        botonSeguirEquipo = new javax.swing.JButton();
        jSeparator42 = new javax.swing.JSeparator();
        entradaFechaNacimientoCapitan = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        opcionesCategoriaCapitan = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        botonConfigurarFaseGrupos = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        botonTorneoMuerteSubita = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        botonFormatoLiga = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        entradaCantidadJugadoresPorGrupo = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        ingresarCantidadDeGrupos = new javax.swing.JComboBox<>();
        botonSeguirFaseGrupos = new javax.swing.JButton();
        botonRegresarConfigurarFaseGrupos = new javax.swing.JButton();
        jLabel138 = new javax.swing.JLabel();
        entradaCantidadJugadoresEliminacionDirecta = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        tablaGeneralLiga = new javax.swing.JTable();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel134 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados1 = new javax.swing.JTable();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel139 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados2 = new javax.swing.JTable();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel140 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados3 = new javax.swing.JTable();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel18 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados4 = new javax.swing.JTable();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel245 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados5 = new javax.swing.JTable();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados7 = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados8 = new javax.swing.JTable();
        jSeparator44 = new javax.swing.JSeparator();
        jLabel250 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados9 = new javax.swing.JTable();
        jSeparator45 = new javax.swing.JSeparator();
        jLabel251 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados6 = new javax.swing.JTable();
        jSeparator46 = new javax.swing.JSeparator();
        jLabel252 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados10 = new javax.swing.JTable();
        jSeparator47 = new javax.swing.JSeparator();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados11 = new javax.swing.JTable();
        jScrollPane23 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados12 = new javax.swing.JTable();
        jSeparator48 = new javax.swing.JSeparator();
        jLabel257 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados13 = new javax.swing.JTable();
        jSeparator49 = new javax.swing.JSeparator();
        jLabel258 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados14 = new javax.swing.JTable();
        jSeparator50 = new javax.swing.JSeparator();
        jLabel259 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jPanel33 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados15 = new javax.swing.JTable();
        jSeparator51 = new javax.swing.JSeparator();
        jLabel260 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados16 = new javax.swing.JTable();
        jSeparator52 = new javax.swing.JSeparator();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados17 = new javax.swing.JTable();
        jScrollPane30 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados18 = new javax.swing.JTable();
        jSeparator53 = new javax.swing.JSeparator();
        jLabel265 = new javax.swing.JLabel();
        jSeparator54 = new javax.swing.JSeparator();
        jLabel266 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados20 = new javax.swing.JTable();
        jSeparator55 = new javax.swing.JSeparator();
        jLabel267 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados21 = new javax.swing.JTable();
        jScrollPane33 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados22 = new javax.swing.JTable();
        jSeparator56 = new javax.swing.JSeparator();
        jLabel268 = new javax.swing.JLabel();
        jScrollPane43 = new javax.swing.JScrollPane();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jScrollPane44 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados19 = new javax.swing.JTable();
        jSeparator63 = new javax.swing.JSeparator();
        jLabel278 = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados23 = new javax.swing.JTable();
        jSeparator64 = new javax.swing.JSeparator();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jScrollPane46 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados24 = new javax.swing.JTable();
        jScrollPane47 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados25 = new javax.swing.JTable();
        jSeparator65 = new javax.swing.JSeparator();
        jLabel283 = new javax.swing.JLabel();
        jSeparator66 = new javax.swing.JSeparator();
        jLabel284 = new javax.swing.JLabel();
        jScrollPane48 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados26 = new javax.swing.JTable();
        jSeparator67 = new javax.swing.JSeparator();
        jLabel285 = new javax.swing.JLabel();
        jScrollPane49 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados27 = new javax.swing.JTable();
        jScrollPane34 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados28 = new javax.swing.JTable();
        jSeparator68 = new javax.swing.JSeparator();
        jLabel286 = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        tablaJugadoresAgregados29 = new javax.swing.JTable();
        jSeparator69 = new javax.swing.JSeparator();
        jLabel287 = new javax.swing.JLabel();

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(250, 250, 250));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel19.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel64.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(153, 153, 153));
        jLabel64.setText("EQUIPOS");
        jPanel19.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, 60));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rogerDobles.jpg"))); // NOI18N
        jLabel55.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel19.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 230, 180));

        jLabel65.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel19.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 240, 150));

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equipoTenis.jpg"))); // NOI18N
        jLabel66.setToolTipText("");
        jLabel66.setAutoscrolls(true);
        jPanel19.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 230, 150));

        jLabel67.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(153, 153, 153));
        jLabel67.setText("como organizador TE INVITO A creaR un torneo...");
        jPanel19.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 60));

        jLabel69.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(153, 153, 153));
        jLabel69.setText("DOBLES");
        jPanel19.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, 60));

        jLabel70.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(153, 153, 153));
        jLabel70.setText("SINGLES");
        jPanel19.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 60));

        jPanel22.setBackground(new java.awt.Color(30, 25, 161));

        jLabel72.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("CREAR TORNEO");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jLabel72)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel19.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 460, 130, 40));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel19.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(759, 146, 315, 389));

        jPanel23.setBackground(new java.awt.Color(30, 25, 161));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("CREAR TORNEO");
        jPanel23.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel19.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel19.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 146, 315, 389));

        jPanel24.setBackground(new java.awt.Color(30, 25, 161));

        jLabel71.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("CREAR TORNEO");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jLabel71)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel19.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 130, 40));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel19.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 146, 315, 389));

        jTabbedPane2.addTab("tab1", jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel73.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(153, 153, 153));
        jLabel73.setText("buscar jugador");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jLabel73)
                .addContainerGap(464, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab2", jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel74.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(153, 153, 153));
        jLabel74.setText("fase eliminacion directa");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel74)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab3", jPanel21);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel83.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(153, 153, 153));
        jLabel83.setText("ver torneos en curso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel83)
                .addContainerGap(436, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab4", jPanel2);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel84.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(153, 153, 153));
        jLabel84.setText("calendario");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel84)
                .addContainerGap(497, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab5", jPanel29);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoEnCurso.png"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        jLabel7.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("VER TORNEOS EN CURSO");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalida.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSalida.setForeground(new java.awt.Color(255, 255, 255));
        botonSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSalida.setText("X");
        botonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalidaMouseClicked(evt);
            }
        });
        jPanel1.add(botonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 20, 40));

        botonMinimizar.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        botonMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonMinimizar.setText("__");
        botonMinimizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 50, 40));

        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoMasGrande.png"))); // NOI18N
        jPanel1.add(iconoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 80));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonMenuVerTorneos.setBackground(new java.awt.Color(204, 204, 255));
        botonMenuVerTorneos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMenuVerTorneosMouseMoved(evt);
            }
        });
        botonMenuVerTorneos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMenuVerTorneosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMenuVerTorneosMouseExited(evt);
            }
        });
        botonMenuVerTorneos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoEnCurso.png"))); // NOI18N
        botonMenuVerTorneos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        jLabel9.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("VER TORNEOS EN CURSO");
        botonMenuVerTorneos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 30));

        jPanel4.add(botonMenuVerTorneos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 360, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerRojo.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 360, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerRojo.jpg"))); // NOI18N
        jLabel13.setText("jLabel12");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 360, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerRojo.jpg"))); // NOI18N
        jLabel17.setText("jLabel12");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 360, 60));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerRojo.jpg"))); // NOI18N
        jLabel18.setText("jLabel12");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 360, 60));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bannerRojo.jpg"))); // NOI18N
        jLabel43.setText("jLabel12");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 360, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setToolTipText("");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 360, 670));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 780));

        pestania.setBackground(new java.awt.Color(255, 255, 255));
        pestania.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel25.setBackground(new java.awt.Color(250, 250, 250));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel25.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel76.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(153, 153, 153));
        jLabel76.setText("EQUIPOS");
        jPanel25.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, 60));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dobleAzul.jpeg"))); // NOI18N
        jLabel56.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel25.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 230, 150));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/djocovikAzul.jpg"))); // NOI18N
        jLabel77.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel25.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 230, 150));

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equipoTenis.jpg"))); // NOI18N
        jLabel78.setToolTipText("");
        jLabel78.setAutoscrolls(true);
        jPanel25.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 230, 150));

        jLabel79.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(153, 153, 153));
        jLabel79.setText("como organizador TE INVITO A creaR un torneo...");
        jPanel25.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 60));

        jLabel80.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(153, 153, 153));
        jLabel80.setText("DOBLES");
        jPanel25.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 60));

        jLabel81.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(153, 153, 153));
        jLabel81.setText("SINGLES");
        jPanel25.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 60));

        botonCrearTorneoDoble.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoDoble.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDobleMouseMoved(evt);
            }
        });
        botonCrearTorneoDoble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDobleMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDobleMouseExited(evt);
            }
        });
        botonCrearTorneoDoble.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("CREAR TORNEO");
        botonCrearTorneoDoble.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel25.add(botonCrearTorneoDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 130, 40));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel25.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 315, 389));

        botonCrearTorneoEquipo.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoEquipo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipoMouseMoved(evt);
            }
        });
        botonCrearTorneoEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipoMouseExited(evt);
            }
        });
        botonCrearTorneoEquipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel94.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("CREAR TORNEO");
        botonCrearTorneoEquipo.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel34.setBackground(new java.awt.Color(30, 25, 161));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel95.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("CREAR TORNEO");
        jPanel34.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoEquipo.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel25.add(botonCrearTorneoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 130, 40));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel25.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 315, 389));

        botonCrearTorneoSingle.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoSingle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingleMouseMoved(evt);
            }
        });
        botonCrearTorneoSingle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingleMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingleMouseExited(evt);
            }
        });
        botonCrearTorneoSingle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel96.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("CREAR TORNEO");
        botonCrearTorneoSingle.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel36.setBackground(new java.awt.Color(30, 25, 161));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("CREAR TORNEO");
        jPanel36.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoSingle.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel25.add(botonCrearTorneoSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 130, 40));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel25.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 315, 389));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel25.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        pestania.addTab("tab1", jPanel25);

        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setToolTipText("");
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel132.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(153, 153, 153));
        jLabel132.setText("Ver torneos en curso...");
        jPanel15.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 60));

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel15.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel92.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(153, 153, 153));
        jLabel92.setText("TORNEO #3");
        jPanel15.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, 60));

        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/alcaraz.jpeg"))); // NOI18N
        jLabel147.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 230, 180));

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FotoSuperiorTenista.jpg"))); // NOI18N
        jLabel148.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, 150));

        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/djocovik celebrando.jpg"))); // NOI18N
        jLabel149.setToolTipText("");
        jLabel149.setAutoscrolls(true);
        jPanel15.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 230, 150));

        jLabel150.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(153, 153, 153));
        jLabel150.setText("TORNEO #2");
        jPanel15.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 60));

        jLabel151.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(153, 153, 153));
        jLabel151.setText("TORNEO #1");
        jPanel15.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 60));

        verTorneo2.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo2MouseMoved(evt);
            }
        });
        verTorneo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo2MouseExited(evt);
            }
        });
        verTorneo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel152.setBackground(new java.awt.Color(255, 255, 255));
        jLabel152.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel152.setText("VER TORNEO");
        jLabel152.setToolTipText("");
        verTorneo2.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(verTorneo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 130, 40));

        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 315, 389));

        verTorneo3.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo3MouseMoved(evt);
            }
        });
        verTorneo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo3MouseExited(evt);
            }
        });
        verTorneo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel154.setBackground(new java.awt.Color(255, 255, 255));
        jLabel154.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel154.setText("VER TORNEO");
        jLabel154.setToolTipText("");
        verTorneo3.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel38.setBackground(new java.awt.Color(30, 25, 161));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel155.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setText("CREAR TORNEO");
        jPanel38.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo3.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 130, 40));

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 315, 389));

        verTorneo1.setBackground(new java.awt.Color(30, 25, 161));
        verTorneo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verTorneo1MouseMoved(evt);
            }
        });
        verTorneo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTorneo1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTorneo1MouseExited(evt);
            }
        });
        verTorneo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel157.setBackground(new java.awt.Color(255, 255, 255));
        jLabel157.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel157.setText("VER TORNEO");
        jLabel157.setToolTipText("");
        verTorneo1.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel39.setBackground(new java.awt.Color(30, 25, 161));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel158.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setText("CREAR TORNEO");
        jPanel39.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        verTorneo1.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(verTorneo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 130, 40));

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 315, 389));

        jLabel160.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(153, 153, 153));
        jLabel160.setText("TORNEO #6");
        jPanel15.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 810, -1, 60));

        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cocoRolandGarros.png"))); // NOI18N
        jLabel161.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 230, 180));

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SteffiGraf.jpg"))); // NOI18N
        jLabel162.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 240, 150));

        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dobleTennisHierba.jpg"))); // NOI18N
        jLabel163.setToolTipText("");
        jLabel163.setAutoscrolls(true);
        jPanel15.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 230, 150));

        jLabel164.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(153, 153, 153));
        jLabel164.setText("TORNEO #5");
        jPanel15.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 810, -1, 60));

        jLabel165.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(153, 153, 153));
        jLabel165.setText("TORNEO #4");
        jPanel15.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 810, -1, 60));

        botonCrearTorneoDoble3.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoDoble3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble3MouseMoved(evt);
            }
        });
        botonCrearTorneoDoble3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble3MouseExited(evt);
            }
        });
        botonCrearTorneoDoble3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel166.setBackground(new java.awt.Color(255, 255, 255));
        jLabel166.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel166.setText("VER TORNEO");
        jLabel166.setToolTipText("");
        botonCrearTorneoDoble3.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(botonCrearTorneoDoble3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 940, 130, 40));

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 315, 389));

        botonCrearTorneoEquipo3.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoEquipo3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo3MouseMoved(evt);
            }
        });
        botonCrearTorneoEquipo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo3MouseExited(evt);
            }
        });
        botonCrearTorneoEquipo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel168.setBackground(new java.awt.Color(255, 255, 255));
        jLabel168.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel168.setText("VER TORNEO");
        jLabel168.setToolTipText("");
        botonCrearTorneoEquipo3.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel40.setBackground(new java.awt.Color(30, 25, 161));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel169.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setText("CREAR TORNEO");
        jPanel40.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoEquipo3.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoEquipo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 940, 130, 40));

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 315, 389));

        botonCrearTorneoSingle3.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoSingle3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle3MouseMoved(evt);
            }
        });
        botonCrearTorneoSingle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle3MouseExited(evt);
            }
        });
        botonCrearTorneoSingle3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel171.setBackground(new java.awt.Color(255, 255, 255));
        jLabel171.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel171.setText("VER TORNEO");
        jLabel171.setToolTipText("");
        botonCrearTorneoSingle3.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel41.setBackground(new java.awt.Color(30, 25, 161));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel172.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setText("CREAR TORNEO");
        jPanel41.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoSingle3.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoSingle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 940, 130, 40));

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 315, 389));

        jLabel174.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(153, 153, 153));
        jLabel174.setText("TORNEO #9");
        jPanel15.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1240, -1, 60));

        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/djocovikReves.jpeg"))); // NOI18N
        jLabel175.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1080, 230, 180));

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doblesFedererLaverCup.jpeg"))); // NOI18N
        jLabel176.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1080, 240, 150));

        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doblesFemenino.jpg"))); // NOI18N
        jLabel177.setToolTipText("");
        jLabel177.setAutoscrolls(true);
        jPanel15.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1080, 230, 150));

        jLabel178.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(153, 153, 153));
        jLabel178.setText("TORNEO #8");
        jPanel15.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1240, -1, 60));

        jLabel179.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(153, 153, 153));
        jLabel179.setText("TORNEO #7");
        jPanel15.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1240, -1, 60));

        botonCrearTorneoDoble4.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoDoble4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble4MouseMoved(evt);
            }
        });
        botonCrearTorneoDoble4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble4MouseExited(evt);
            }
        });
        botonCrearTorneoDoble4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel180.setBackground(new java.awt.Color(255, 255, 255));
        jLabel180.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("VER TORNEO");
        jLabel180.setToolTipText("");
        botonCrearTorneoDoble4.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(botonCrearTorneoDoble4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1370, 130, 40));

        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1050, 315, 389));

        botonCrearTorneoEquipo4.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoEquipo4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo4MouseMoved(evt);
            }
        });
        botonCrearTorneoEquipo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo4MouseExited(evt);
            }
        });
        botonCrearTorneoEquipo4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel182.setBackground(new java.awt.Color(255, 255, 255));
        jLabel182.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel182.setText("VER TORNEO");
        jLabel182.setToolTipText("");
        botonCrearTorneoEquipo4.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel42.setBackground(new java.awt.Color(30, 25, 161));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel183.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setText("CREAR TORNEO");
        jPanel42.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoEquipo4.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoEquipo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1370, 130, 40));

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 1050, 315, 389));

        botonCrearTorneoSingle4.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoSingle4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle4MouseMoved(evt);
            }
        });
        botonCrearTorneoSingle4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle4MouseExited(evt);
            }
        });
        botonCrearTorneoSingle4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel185.setBackground(new java.awt.Color(255, 255, 255));
        jLabel185.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(255, 255, 255));
        jLabel185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel185.setText("VER TORNEO");
        jLabel185.setToolTipText("");
        botonCrearTorneoSingle4.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel43.setBackground(new java.awt.Color(30, 25, 161));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel186.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setText("CREAR TORNEO");
        jPanel43.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoSingle4.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoSingle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1370, 130, 40));

        jLabel187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1050, 315, 389));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel15.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 900, 20));

        jLabel188.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(153, 153, 153));
        jLabel188.setText("TORNEO #12");
        jPanel15.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 1660, -1, 60));

        jLabel189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/federerUSOpen.jpg"))); // NOI18N
        jLabel189.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1500, 230, 180));

        jLabel190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doblesMixto.jpg"))); // NOI18N
        jLabel190.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1500, 240, 150));

        jLabel191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/golpeRevesJugador.jpeg"))); // NOI18N
        jLabel191.setToolTipText("");
        jLabel191.setAutoscrolls(true);
        jPanel15.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1500, 230, 150));

        jLabel192.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(153, 153, 153));
        jLabel192.setText("TORNEO #11");
        jPanel15.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1660, -1, 60));

        jLabel193.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(153, 153, 153));
        jLabel193.setText("TORNEO #10");
        jPanel15.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1660, -1, 60));

        botonCrearTorneoDoble5.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoDoble5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble5MouseMoved(evt);
            }
        });
        botonCrearTorneoDoble5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble5MouseExited(evt);
            }
        });
        botonCrearTorneoDoble5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel194.setBackground(new java.awt.Color(255, 255, 255));
        jLabel194.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(255, 255, 255));
        jLabel194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel194.setText("VER TORNEO");
        jLabel194.setToolTipText("");
        botonCrearTorneoDoble5.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(botonCrearTorneoDoble5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1790, 130, 40));

        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1470, 315, 389));

        botonCrearTorneoEquipo5.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoEquipo5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo5MouseMoved(evt);
            }
        });
        botonCrearTorneoEquipo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo5MouseExited(evt);
            }
        });
        botonCrearTorneoEquipo5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel196.setBackground(new java.awt.Color(255, 255, 255));
        jLabel196.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel196.setText("VER TORNEO");
        jLabel196.setToolTipText("");
        botonCrearTorneoEquipo5.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel44.setBackground(new java.awt.Color(30, 25, 161));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel197.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setText("CREAR TORNEO");
        jPanel44.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoEquipo5.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoEquipo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 1790, 130, 40));

        jLabel198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 1470, 315, 389));

        botonCrearTorneoSingle5.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoSingle5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle5MouseMoved(evt);
            }
        });
        botonCrearTorneoSingle5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle5MouseExited(evt);
            }
        });
        botonCrearTorneoSingle5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel199.setBackground(new java.awt.Color(255, 255, 255));
        jLabel199.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel199.setText("VER TORNEO");
        jLabel199.setToolTipText("");
        botonCrearTorneoSingle5.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel45.setBackground(new java.awt.Color(30, 25, 161));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel200.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(255, 255, 255));
        jLabel200.setText("CREAR TORNEO");
        jPanel45.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoSingle5.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoSingle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1790, 130, 40));

        jLabel201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1470, 315, 389));

        jLabel202.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(153, 153, 153));
        jLabel202.setText("TORNEO #15");
        jPanel15.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2090, -1, 60));

        jLabel203.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rafavsfedererWimbledon.jpg"))); // NOI18N
        jLabel203.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1930, 230, 180));

        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rafaNadalRolandGarros.jpg"))); // NOI18N
        jLabel204.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1930, 240, 150));

        jLabel205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/runeCara.jpeg"))); // NOI18N
        jLabel205.setToolTipText("");
        jLabel205.setAutoscrolls(true);
        jPanel15.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 1930, 230, 150));

        jLabel206.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(153, 153, 153));
        jLabel206.setText("TORNEO #14");
        jPanel15.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 2090, -1, 60));

        jLabel207.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(153, 153, 153));
        jLabel207.setText("TORNEO #13");
        jPanel15.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 2090, -1, 60));

        botonCrearTorneoDoble6.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoDoble6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble6MouseMoved(evt);
            }
        });
        botonCrearTorneoDoble6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble6MouseExited(evt);
            }
        });
        botonCrearTorneoDoble6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel208.setBackground(new java.awt.Color(255, 255, 255));
        jLabel208.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(255, 255, 255));
        jLabel208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel208.setText("VER TORNEO");
        jLabel208.setToolTipText("");
        botonCrearTorneoDoble6.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(botonCrearTorneoDoble6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 2220, 130, 40));

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 1900, 315, 389));

        botonCrearTorneoEquipo6.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoEquipo6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo6MouseMoved(evt);
            }
        });
        botonCrearTorneoEquipo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo6MouseExited(evt);
            }
        });
        botonCrearTorneoEquipo6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel210.setBackground(new java.awt.Color(255, 255, 255));
        jLabel210.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(255, 255, 255));
        jLabel210.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel210.setText("VER TORNEO");
        jLabel210.setToolTipText("");
        botonCrearTorneoEquipo6.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel46.setBackground(new java.awt.Color(30, 25, 161));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel211.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel211.setForeground(new java.awt.Color(255, 255, 255));
        jLabel211.setText("CREAR TORNEO");
        jPanel46.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoEquipo6.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoEquipo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 2220, 130, 40));

        jLabel212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 1900, 315, 389));

        botonCrearTorneoSingle6.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoSingle6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle6MouseMoved(evt);
            }
        });
        botonCrearTorneoSingle6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle6MouseExited(evt);
            }
        });
        botonCrearTorneoSingle6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel213.setBackground(new java.awt.Color(255, 255, 255));
        jLabel213.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(255, 255, 255));
        jLabel213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel213.setText("VER TORNEO");
        jLabel213.setToolTipText("");
        botonCrearTorneoSingle6.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel47.setBackground(new java.awt.Color(30, 25, 161));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel214.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(255, 255, 255));
        jLabel214.setText("CREAR TORNEO");
        jPanel47.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoSingle6.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoSingle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 2220, 130, 40));

        jLabel215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1900, 315, 389));

        jLabel216.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(153, 153, 153));
        jLabel216.setText("TORNEO #18");
        jPanel15.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2510, -1, 60));

        jLabel217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel217.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sabalekaTribuna.jpeg"))); // NOI18N
        jLabel217.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 2350, 230, 180));

        jLabel218.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/runeGlobo.jpg"))); // NOI18N
        jLabel218.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 2350, 240, 150));

        jLabel219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel219.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/serenaWilliamsWimbledon.jpg"))); // NOI18N
        jLabel219.setToolTipText("");
        jLabel219.setAutoscrolls(true);
        jPanel15.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 2350, 230, 150));

        jLabel220.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(153, 153, 153));
        jLabel220.setText("TORNEO #17");
        jPanel15.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 2510, -1, 60));

        jLabel221.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(153, 153, 153));
        jLabel221.setText("TORNEO #16");
        jPanel15.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 2510, -1, 60));

        botonCrearTorneoDoble7.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoDoble7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble7MouseMoved(evt);
            }
        });
        botonCrearTorneoDoble7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble7MouseExited(evt);
            }
        });
        botonCrearTorneoDoble7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel222.setBackground(new java.awt.Color(255, 255, 255));
        jLabel222.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel222.setText("VER TORNEO");
        jLabel222.setToolTipText("");
        botonCrearTorneoDoble7.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(botonCrearTorneoDoble7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 2640, 130, 40));

        jLabel223.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2320, 315, 389));

        botonCrearTorneoEquipo7.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoEquipo7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo7MouseMoved(evt);
            }
        });
        botonCrearTorneoEquipo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo7MouseExited(evt);
            }
        });
        botonCrearTorneoEquipo7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel224.setBackground(new java.awt.Color(255, 255, 255));
        jLabel224.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(255, 255, 255));
        jLabel224.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel224.setText("VER TORNEO");
        jLabel224.setToolTipText("");
        botonCrearTorneoEquipo7.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel48.setBackground(new java.awt.Color(30, 25, 161));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel225.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel225.setForeground(new java.awt.Color(255, 255, 255));
        jLabel225.setText("CREAR TORNEO");
        jPanel48.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoEquipo7.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoEquipo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 2640, 130, 40));

        jLabel226.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 2320, 315, 389));

        botonCrearTorneoSingle7.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoSingle7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle7MouseMoved(evt);
            }
        });
        botonCrearTorneoSingle7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle7MouseExited(evt);
            }
        });
        botonCrearTorneoSingle7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel227.setBackground(new java.awt.Color(255, 255, 255));
        jLabel227.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel227.setForeground(new java.awt.Color(255, 255, 255));
        jLabel227.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel227.setText("VER TORNEO");
        jLabel227.setToolTipText("");
        botonCrearTorneoSingle7.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel49.setBackground(new java.awt.Color(30, 25, 161));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel228.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel228.setForeground(new java.awt.Color(255, 255, 255));
        jLabel228.setText("CREAR TORNEO");
        jPanel49.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoSingle7.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoSingle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 2640, 130, 40));

        jLabel229.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2320, 315, 389));

        jLabel230.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel230.setForeground(new java.awt.Color(153, 153, 153));
        jLabel230.setText("TORNEO #21");
        jPanel15.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 2940, -1, 60));

        jLabel231.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel231.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doblesMasculino.jpg"))); // NOI18N
        jLabel231.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 2780, 230, 180));

        jLabel232.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sinnerArriba.jpg"))); // NOI18N
        jLabel232.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 2780, 240, 150));

        jLabel233.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel233.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sinnerGolpeDerecha.jpg"))); // NOI18N
        jLabel233.setToolTipText("");
        jLabel233.setAutoscrolls(true);
        jPanel15.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 2780, 230, 150));

        jLabel234.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel234.setForeground(new java.awt.Color(153, 153, 153));
        jLabel234.setText("TORNEO #20");
        jPanel15.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 2940, -1, 60));

        jLabel235.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel235.setForeground(new java.awt.Color(153, 153, 153));
        jLabel235.setText("TORNEO #19");
        jPanel15.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 2940, -1, 60));

        botonCrearTorneoDoble8.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoDoble8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble8MouseMoved(evt);
            }
        });
        botonCrearTorneoDoble8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoDoble8MouseExited(evt);
            }
        });
        botonCrearTorneoDoble8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel236.setBackground(new java.awt.Color(255, 255, 255));
        jLabel236.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel236.setForeground(new java.awt.Color(255, 255, 255));
        jLabel236.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel236.setText("VER TORNEO");
        jLabel236.setToolTipText("");
        botonCrearTorneoDoble8.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel15.add(botonCrearTorneoDoble8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 3070, 130, 40));

        jLabel237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 2750, 315, 389));

        botonCrearTorneoEquipo8.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoEquipo8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo8MouseMoved(evt);
            }
        });
        botonCrearTorneoEquipo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoEquipo8MouseExited(evt);
            }
        });
        botonCrearTorneoEquipo8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel238.setBackground(new java.awt.Color(255, 255, 255));
        jLabel238.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel238.setForeground(new java.awt.Color(255, 255, 255));
        jLabel238.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel238.setText("VER TORNEO");
        jLabel238.setToolTipText("");
        botonCrearTorneoEquipo8.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel50.setBackground(new java.awt.Color(30, 25, 161));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel239.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(255, 255, 255));
        jLabel239.setText("CREAR TORNEO");
        jPanel50.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoEquipo8.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoEquipo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 3070, 130, 40));

        jLabel240.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 2750, 315, 389));

        botonCrearTorneoSingle8.setBackground(new java.awt.Color(30, 25, 161));
        botonCrearTorneoSingle8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle8MouseMoved(evt);
            }
        });
        botonCrearTorneoSingle8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearTorneoSingle8MouseExited(evt);
            }
        });
        botonCrearTorneoSingle8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel241.setBackground(new java.awt.Color(255, 255, 255));
        jLabel241.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel241.setForeground(new java.awt.Color(255, 255, 255));
        jLabel241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel241.setText("VER TORNEO");
        jLabel241.setToolTipText("");
        botonCrearTorneoSingle8.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jPanel51.setBackground(new java.awt.Color(30, 25, 161));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel242.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(255, 255, 255));
        jLabel242.setText("CREAR TORNEO");
        jPanel51.add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonCrearTorneoSingle8.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel15.add(botonCrearTorneoSingle8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 3070, 130, 40));

        jLabel243.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel15.add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2750, 315, 389));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 3200));

        jScrollPane5.setViewportView(jPanel14);

        pestania.addTab("tab2", jScrollPane5);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscarJugador.setBackground(new java.awt.Color(30, 25, 161));
        botonBuscarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        botonBuscarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarJugador.setText("Buscar");
        botonBuscarJugador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonBuscarJugadorMouseMoved(evt);
            }
        });
        botonBuscarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarJugadorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarJugadorMouseExited(evt);
            }
        });
        jPanel30.add(botonBuscarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 40));

        textoBuscarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        textoBuscarJugador.setForeground(new java.awt.Color(153, 153, 153));
        textoBuscarJugador.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textoBuscarJugador.setText("Ingresar cedula del jugador a buscar...");
        textoBuscarJugador.setToolTipText("");
        textoBuscarJugador.setBorder(null);
        textoBuscarJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textoBuscarJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textoBuscarJugadorFocusLost(evt);
            }
        });
        textoBuscarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBuscarJugadorActionPerformed(evt);
            }
        });
        jPanel30.add(textoBuscarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 800, 40));
        jPanel30.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 820, 10));

        IconoCalendario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fotoPerfilPequenio.png"))); // NOI18N
        jPanel30.add(IconoCalendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 230, 200));

        jLabel21.setBackground(new java.awt.Color(51, 51, 51));
        jLabel21.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Equipo en otro torneo");
        jPanel30.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, 30));

        jLabel23.setBackground(new java.awt.Color(51, 51, 51));
        jLabel23.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("ficha DEL JUGADOR: ");
        jPanel30.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel24.setBackground(new java.awt.Color(51, 51, 51));
        jLabel24.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("FECHA DE NACIMIENTO");
        jPanel30.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, 30));

        jLabel25.setBackground(new java.awt.Color(51, 51, 51));
        jLabel25.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("NÚMERO DE CEDULA");
        jPanel30.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, 30));

        jLabel26.setBackground(new java.awt.Color(51, 51, 51));
        jLabel26.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("CORREO ELECTRÓNICO");
        jPanel30.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, 30));

        jLabel27.setBackground(new java.awt.Color(51, 51, 51));
        jLabel27.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("TORNEOS EN LOS QUE PARTICIPA:");
        jPanel30.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, 30));

        jLabel37.setBackground(new java.awt.Color(51, 51, 51));
        jLabel37.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("CATEGORIA");
        jPanel30.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, 30));

        jLabel38.setBackground(new java.awt.Color(51, 51, 51));
        jLabel38.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("Partidos JUGADOS:");
        jPanel30.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, 30));

        jLabel39.setBackground(new java.awt.Color(51, 51, 51));
        jLabel39.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("Partidos GANADOS:");
        jPanel30.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, -1, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jTextField2.setText("DD/MM/YYYY");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 140, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jTextField3.setText("CORREO ELECTRONICO");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 190, -1));

        mostrarNombre.setEditable(false);
        mostrarNombre.setBackground(new java.awt.Color(255, 255, 255));
        mostrarNombre.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        mostrarNombre.setText("Nombre del Jugador");
        mostrarNombre.setToolTipText("");
        mostrarNombre.setBorder(null);
        mostrarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarNombreActionPerformed(evt);
            }
        });
        jPanel30.add(mostrarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 680, -1));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jTextField5.setText("TAMANACO TEAM");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 140, -1));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jTextField6.setText("CEDULA DE IDENTIDAD");
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 140, -1));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jTextField7.setText("999");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 40, 30));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jTextField8.setText("CATEGORIA");
        jTextField8.setBorder(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 140, -1));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jTextField9.setText("TORNEOS EN LOS QUE PARTICIPA EL JUGADOR");
        jTextField9.setBorder(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 370, 30));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jTextField10.setText("999");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 50, 30));
        jPanel30.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 77, 820, -1));

        jLabel40.setBackground(new java.awt.Color(51, 51, 51));
        jLabel40.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Número de telefono");
        jPanel30.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, 30));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jTextField11.setText("Numero de telefono");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 140, -1));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cuadradoMasGrande.png"))); // NOI18N
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel30.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 1010, 510));
        jPanel30.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 820, 10));

        pestania.addTab("tab3", jPanel30);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel32.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel32.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 900, 10));

        pestania.addTab("tab4", jPanel32);

        pestaniaCrearTorneoInicio.setBackground(new java.awt.Color(255, 255, 255));
        pestaniaCrearTorneoInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel14.setText("Ingresar nombre del torneo:");
        pestaniaCrearTorneoInicio.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        entradaNombreTorneo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreTorneo.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreTorneo.setText("Ingresar nombre del torneo");
        entradaNombreTorneo.setBorder(null);
        entradaNombreTorneo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreTorneoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreTorneoFocusLost(evt);
            }
        });
        entradaNombreTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreTorneoActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(entradaNombreTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        pestaniaCrearTorneoInicio1.setBackground(new java.awt.Color(255, 255, 255));
        pestaniaCrearTorneoInicio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pestaniaCrearTorneoInicio.add(pestaniaCrearTorneoInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));
        pestaniaCrearTorneoInicio.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 350, 10));
        pestaniaCrearTorneoInicio.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 10));
        pestaniaCrearTorneoInicio.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 350, 10));
        pestaniaCrearTorneoInicio.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 350, 10));

        entradaCostoTorneo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCostoTorneo.setForeground(new java.awt.Color(153, 153, 153));
        entradaCostoTorneo.setText("Ingresar costo del torneo");
        entradaCostoTorneo.setBorder(null);
        entradaCostoTorneo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCostoTorneoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCostoTorneoFocusLost(evt);
            }
        });
        entradaCostoTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCostoTorneoActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(entradaCostoTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 220, -1));

        jLabel19.setBackground(new java.awt.Color(51, 51, 51));
        jLabel19.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel19.setText("RONDAS DE ELIMINACION DIRECTA:");
        pestaniaCrearTorneoInicio.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        pestaniaCrearTorneoInicio.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel82.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(153, 153, 153));
        jLabel82.setText("Ingresar datos del torneo...");
        pestaniaCrearTorneoInicio.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        entradaCantidadJugadores.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCantidadJugadores.setForeground(new java.awt.Color(153, 153, 153));
        entradaCantidadJugadores.setText("Ingresar un numero");
        entradaCantidadJugadores.setBorder(null);
        entradaCantidadJugadores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresFocusLost(evt);
            }
        });
        entradaCantidadJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCantidadJugadoresActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(entradaCantidadJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel16.setText("INGRESAR CANTIDAD DE JUGADORES/DUPLAS/equipos: ");
        pestaniaCrearTorneoInicio.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, 30));

        botonSeguirIngresarDatosTorneo.setBackground(new java.awt.Color(36, 20, 188));
        botonSeguirIngresarDatosTorneo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirIngresarDatosTorneo.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirIngresarDatosTorneo.setText("SEGUIR");
        botonSeguirIngresarDatosTorneo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneoMouseMoved(evt);
            }
        });
        botonSeguirIngresarDatosTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarDatosTorneoMouseExited(evt);
            }
        });
        botonSeguirIngresarDatosTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirIngresarDatosTorneoActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(botonSeguirIngresarDatosTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 140, 40));

        botonRegresarIngresarDatosTorneo.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosTorneo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosTorneo.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosTorneo.setText("REGRESAR");
        botonRegresarIngresarDatosTorneo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneoMouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosTorneoMouseExited(evt);
            }
        });
        botonRegresarIngresarDatosTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosTorneoActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(botonRegresarIngresarDatosTorneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 140, 40));

        jLabel42.setBackground(new java.awt.Color(51, 51, 51));
        jLabel42.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel42.setText("INGRESAR COSTO DEL TORNEO:");
        pestaniaCrearTorneoInicio.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, -1, 30));

        ingresarRondaEliminacionDirecta.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        ingresarRondaEliminacionDirecta.setForeground(new java.awt.Color(153, 153, 153));
        ingresarRondaEliminacionDirecta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIECISEISAVOS", "OCTAVOS", "CUARTOS", "SEMIFINALES", "FINAL" }));
        ingresarRondaEliminacionDirecta.setToolTipText("");
        ingresarRondaEliminacionDirecta.setBorder(null);
        ingresarRondaEliminacionDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarRondaEliminacionDirectaActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(ingresarRondaEliminacionDirecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 250, 30));

        ingresarRondaEliminacionDirecta3.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        ingresarRondaEliminacionDirecta3.setForeground(new java.awt.Color(153, 153, 153));
        ingresarRondaEliminacionDirecta3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3ra Categoria" }));
        ingresarRondaEliminacionDirecta3.setToolTipText("");
        ingresarRondaEliminacionDirecta3.setBorder(null);
        ingresarRondaEliminacionDirecta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarRondaEliminacionDirecta3ActionPerformed(evt);
            }
        });
        pestaniaCrearTorneoInicio.add(ingresarRondaEliminacionDirecta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 250, 30));

        jLabel91.setBackground(new java.awt.Color(51, 51, 51));
        jLabel91.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel91.setText("Categoria MAXIMA DEL torneo");
        pestaniaCrearTorneoInicio.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 30));
        pestaniaCrearTorneoInicio.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 350, 10));

        pestania.addTab("tab5", pestaniaCrearTorneoInicio);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel98.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(153, 153, 153));
        jLabel98.setText("Ingresar DATOS DE LOS JUGADORES PARTICIPANTES DEL torneo...");
        jPanel6.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jPanel6.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 10));

        entradaNombreJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreJugador.setText("Ingresar nombre del jugador");
        entradaNombreJugador.setBorder(null);
        entradaNombreJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorFocusLost(evt);
            }
        });
        entradaNombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel29.setBackground(new java.awt.Color(51, 51, 51));
        jLabel29.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel29.setText("Ingresar nombre deL JUGADOR:");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        entradaIDJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaIDJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaIDJugador.setText("Ingresar numero de cedula del jugador");
        entradaIDJugador.setBorder(null);
        entradaIDJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaIDJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaIDJugadorFocusLost(evt);
            }
        });
        entradaIDJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaIDJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaIDJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));
        jPanel6.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 350, 10));

        jLabel30.setBackground(new java.awt.Color(51, 51, 51));
        jLabel30.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel30.setText("Ingresar NÚMERO DE CEDULA DEL JUGADOR:");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, 30));
        jPanel6.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 350, 10));

        entradaNumeroTelefonoJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNumeroTelefonoJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaNumeroTelefonoJugador.setText("Ingresar numero de telefono del jugador");
        entradaNumeroTelefonoJugador.setBorder(null);
        entradaNumeroTelefonoJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorFocusLost(evt);
            }
        });
        entradaNumeroTelefonoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNumeroTelefonoJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaNumeroTelefonoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel31.setBackground(new java.awt.Color(51, 51, 51));
        jLabel31.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel31.setText("Ingresar NÚMERO DE TELEFONO deL JUGADOR:");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, 30));
        jPanel6.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 350, 10));

        entradaEmailJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEmailJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaEmailJugador.setText("Ingresar correo del jugador");
        entradaEmailJugador.setBorder(null);
        entradaEmailJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorFocusLost(evt);
            }
        });
        entradaEmailJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEmailJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaEmailJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, -1));

        jLabel32.setBackground(new java.awt.Color(51, 51, 51));
        jLabel32.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel32.setText("Ingresar CORREO deL JUGADOR:");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, 30));

        jLabel33.setBackground(new java.awt.Color(51, 51, 51));
        jLabel33.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel33.setText("Ingresar CATEGORÍA deL JUGADOR:");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, 30));

        jLabel34.setBackground(new java.awt.Color(51, 51, 51));
        jLabel34.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel34.setText("Ingresar EQUIPO deL JUGADOR:");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, 30));

        entradaEquipoJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEquipoJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaEquipoJugador.setText("Ingresar equipo externo del jugador");
        entradaEquipoJugador.setBorder(null);
        entradaEquipoJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorFocusLost(evt);
            }
        });
        entradaEquipoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEquipoJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaEquipoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, -1, 20));
        jPanel6.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 350, 10));
        jPanel6.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 350, 10));

        entradaFechaNacimientoJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaFechaNacimientoJugador.setForeground(new java.awt.Color(153, 153, 153));
        entradaFechaNacimientoJugador.setText("Ingresar fecha de nacimiento (DD-MM-YYYY)");
        entradaFechaNacimientoJugador.setBorder(null);
        entradaFechaNacimientoJugador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorFocusLost(evt);
            }
        });
        entradaFechaNacimientoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFechaNacimientoJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(entradaFechaNacimientoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, -1));

        jLabel35.setBackground(new java.awt.Color(51, 51, 51));
        jLabel35.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("VISTA DE JUGADORES YA AGREGADOS:");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 750, -1, 30));

        tablaJugadoresAgregados.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tablaJugadoresAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula", "Telefono", "Categoria"
            }
        ));
        tablaJugadoresAgregados.setAutoscrolls(false);
        tablaJugadoresAgregados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaJugadoresAgregados.setGridColor(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaJugadoresAgregados.setSelectionForeground(new java.awt.Color(30, 25, 161));
        jScrollPane2.setViewportView(tablaJugadoresAgregados);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 790, 840, 410));

        botonSubirFotoJugador.setBackground(new java.awt.Color(30, 25, 161));
        botonSubirFotoJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSubirFotoJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonSubirFotoJugador.setText("SUBIR FOTO");
        botonSubirFotoJugador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSubirFotoJugadorMouseMoved(evt);
            }
        });
        botonSubirFotoJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSubirFotoJugadorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSubirFotoJugadorMouseExited(evt);
            }
        });
        botonSubirFotoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirFotoJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(botonSubirFotoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 140, 30));

        botonRegresarIngresarDatosSingle.setBackground(new java.awt.Color(30, 25, 161));
        botonRegresarIngresarDatosSingle.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosSingle.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosSingle.setText("REGRESAR");
        botonRegresarIngresarDatosSingle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosSingleMouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosSingle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosSingleMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosSingleMouseExited(evt);
            }
        });
        botonRegresarIngresarDatosSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosSingleActionPerformed(evt);
            }
        });
        jPanel6.add(botonRegresarIngresarDatosSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 140, 40));

        botonAgregarJugador.setBackground(new java.awt.Color(30, 25, 161));
        botonAgregarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonAgregarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarJugador.setText("AGREGAR JUGADOR");
        botonAgregarJugador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonAgregarJugadorMouseMoved(evt);
            }
        });
        botonAgregarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarJugadorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarJugadorMouseExited(evt);
            }
        });
        botonAgregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(botonAgregarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, 140, 40));

        jLabel36.setBackground(new java.awt.Color(51, 51, 51));
        jLabel36.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel36.setText("SUBIR FOTO DEL JUGADOR:");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, -1, 30));

        jLabel41.setBackground(new java.awt.Color(51, 51, 51));
        jLabel41.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel41.setText("Ingresar fecha de nacimiento deL JUGADOR:");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, 30));

        botonSeguirIngresarJugador.setBackground(new java.awt.Color(30, 25, 161));
        botonSeguirIngresarJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirIngresarJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirIngresarJugador.setText("SEGUIR");
        botonSeguirIngresarJugador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarJugadorMouseMoved(evt);
            }
        });
        botonSeguirIngresarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarJugadorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirIngresarJugadorMouseExited(evt);
            }
        });
        botonSeguirIngresarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirIngresarJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(botonSeguirIngresarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 140, 40));

        opcionesCategoriaJugador.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        opcionesCategoriaJugador.setForeground(new java.awt.Color(153, 153, 153));
        opcionesCategoriaJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3era Categoria" }));
        opcionesCategoriaJugador.setBorder(null);
        opcionesCategoriaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriaJugadorActionPerformed(evt);
            }
        });
        jPanel6.add(opcionesCategoriaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 350, 30));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 1260));

        jScrollPane1.setViewportView(jPanel5);

        pestania.addTab("tab6", jScrollPane1);

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(1032, 1600));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setForeground(new java.awt.Color(153, 153, 153));
        jPanel10.setPreferredSize(new java.awt.Dimension(938, 1600));
        jPanel10.setRequestFocusEnabled(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(153, 153, 153));
        jLabel99.setText("Ingresar DATOS DE LAS DUPLAS PARTICIPANTES DEL torneo...");
        jPanel10.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel10.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jPanel10.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 10));

        entradaNombreJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreJugadorA.setText("Ingresar nombre del jugador");
        entradaNombreJugadorA.setBorder(null);
        entradaNombreJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorAFocusLost(evt);
            }
        });
        entradaNombreJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaNombreJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel46.setText("Ingresar nombre deL JUGADOR A:");
        jPanel10.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        entradaIdJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaIdJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaIdJugadorA.setText("Ingresar numero de cedula jugador");
        entradaIdJugadorA.setBorder(null);
        entradaIdJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaIdJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaIdJugadorAFocusLost(evt);
            }
        });
        entradaIdJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaIdJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaIdJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));
        jPanel10.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 350, 10));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel47.setText("Ingresar NÚMERO DE CEDULA DEL JUGADOR A:");
        jPanel10.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, 30));
        jPanel10.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 350, 10));

        entradaNumeroTelefonoJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNumeroTelefonoJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaNumeroTelefonoJugadorA.setText("Ingresar numero de telefono del jugador");
        entradaNumeroTelefonoJugadorA.setBorder(null);
        entradaNumeroTelefonoJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorAFocusLost(evt);
            }
        });
        entradaNumeroTelefonoJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNumeroTelefonoJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaNumeroTelefonoJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 280, -1));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel48.setText("Ingresar NÚMERO DE TELEFONO deL JUGADOR A:");
        jPanel10.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, -1, 30));
        jPanel10.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 350, 10));

        entradaEmailJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEmailJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaEmailJugadorA.setText("Ingresar correo del jugador");
        entradaEmailJugadorA.setToolTipText("");
        entradaEmailJugadorA.setBorder(null);
        entradaEmailJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorAFocusLost(evt);
            }
        });
        entradaEmailJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEmailJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaEmailJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel49.setText("Ingresar CORREO deL JUGADOR A:");
        jPanel10.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, 30));

        jLabel50.setBackground(new java.awt.Color(51, 51, 51));
        jLabel50.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel50.setText("Ingresar CATEGORÍA deL JUGADOR A:");
        jPanel10.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 750, -1, 30));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel51.setText("Ingresar EQUIPO deL JUGADOR A:");
        jPanel10.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, 30));

        entradaEquipoJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEquipoJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaEquipoJugadorA.setText("Ingresar equipo del jugador");
        entradaEquipoJugadorA.setBorder(null);
        entradaEquipoJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorAFocusLost(evt);
            }
        });
        entradaEquipoJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEquipoJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaEquipoJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, 20));
        jPanel10.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 350, 10));
        jPanel10.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 930, 350, 10));

        entradaFechaNacimientoJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaFechaNacimientoJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        entradaFechaNacimientoJugadorA.setText("Ingresar fecha de nacimiento (DD-MM-YYYY)");
        entradaFechaNacimientoJugadorA.setBorder(null);
        entradaFechaNacimientoJugadorA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorAFocusLost(evt);
            }
        });
        entradaFechaNacimientoJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFechaNacimientoJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(entradaFechaNacimientoJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 900, -1, -1));

        jLabel52.setBackground(new java.awt.Color(51, 51, 51));
        jLabel52.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setText("VISTA DE JUGADORES YA AGREGADOS:");
        jPanel10.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1120, -1, 30));

        botonFotoJugadorA.setBackground(new java.awt.Color(36, 20, 188));
        botonFotoJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonFotoJugadorA.setForeground(new java.awt.Color(255, 255, 255));
        botonFotoJugadorA.setText("SUBIR FOTO");
        botonFotoJugadorA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonFotoJugadorAMouseMoved(evt);
            }
        });
        botonFotoJugadorA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonFotoJugadorAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonFotoJugadorAMouseExited(evt);
            }
        });
        botonFotoJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFotoJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(botonFotoJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 970, 130, 30));

        botonRegresarIngresarDatosDobles.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosDobles.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosDobles.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosDobles.setText("REGRESAR");
        botonRegresarIngresarDatosDobles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosDoblesMouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosDobles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosDoblesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosDoblesMouseExited(evt);
            }
        });
        botonRegresarIngresarDatosDobles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosDoblesActionPerformed(evt);
            }
        });
        jPanel10.add(botonRegresarIngresarDatosDobles, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1050, 140, 40));

        botonAgregarJugadoresDupla.setBackground(new java.awt.Color(36, 20, 188));
        botonAgregarJugadoresDupla.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonAgregarJugadoresDupla.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarJugadoresDupla.setText("AGREGAR JUGADORes");
        botonAgregarJugadoresDupla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonAgregarJugadoresDuplaMouseMoved(evt);
            }
        });
        botonAgregarJugadoresDupla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarJugadoresDuplaMouseExited(evt);
            }
        });
        botonAgregarJugadoresDupla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarJugadoresDuplaActionPerformed(evt);
            }
        });
        jPanel10.add(botonAgregarJugadoresDupla, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 1050, 150, 40));

        jLabel53.setBackground(new java.awt.Color(51, 51, 51));
        jLabel53.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setText("SUBIR FOTO DEL JUGADOR A:");
        jPanel10.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 970, -1, 30));

        jLabel54.setBackground(new java.awt.Color(51, 51, 51));
        jLabel54.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel54.setText("Ingresar fecha de nacimiento deL JUGADOR A:");
        jPanel10.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 860, -1, 30));

        botonSeguirDuplas.setBackground(new java.awt.Color(36, 20, 188));
        botonSeguirDuplas.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirDuplas.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirDuplas.setText("SEGUIR");
        botonSeguirDuplas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirDuplasMouseMoved(evt);
            }
        });
        botonSeguirDuplas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirDuplasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirDuplasMouseExited(evt);
            }
        });
        botonSeguirDuplas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirDuplasActionPerformed(evt);
            }
        });
        jPanel10.add(botonSeguirDuplas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 1050, 140, 40));
        jPanel10.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 350, 10));

        entradaNombreJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreJugadorB.setText("Ingresar nombre del jugador");
        entradaNombreJugadorB.setBorder(null);
        entradaNombreJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreJugadorBFocusLost(evt);
            }
        });
        entradaNombreJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaNombreJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel57.setText("Ingresar nombre deL JUGADOR B:");
        jPanel10.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, 30));

        entradaIdJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaIdJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaIdJugadorB.setText("Ingresar numero de cedula jugador");
        entradaIdJugadorB.setBorder(null);
        entradaIdJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaIdJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaIdJugadorBFocusLost(evt);
            }
        });
        entradaIdJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaIdJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaIdJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));
        jPanel10.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 350, 10));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel58.setText("Ingresar NÚMERO DE CEDULA DEL JUGADOR B:");
        jPanel10.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, 30));
        jPanel10.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 710, 350, 10));

        entradaNumeroTelefonoJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNumeroTelefonoJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaNumeroTelefonoJugadorB.setText("Ingresar numero de telefono del jugador");
        entradaNumeroTelefonoJugadorB.setBorder(null);
        entradaNumeroTelefonoJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoJugadorBFocusLost(evt);
            }
        });
        entradaNumeroTelefonoJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNumeroTelefonoJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaNumeroTelefonoJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, 320, -1));

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel59.setText("Ingresar NÚMERO DE TELEFONO deL JUGADOR B:");
        jPanel10.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, -1, 30));
        jPanel10.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 350, 10));

        entradaEmailJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEmailJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaEmailJugadorB.setText("Ingresar correo del jugador");
        entradaEmailJugadorB.setBorder(null);
        entradaEmailJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEmailJugadorBFocusLost(evt);
            }
        });
        entradaEmailJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEmailJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaEmailJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel88.setText("Ingresar CORREO deL JUGADOR B:");
        jPanel10.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, 30));

        jLabel90.setBackground(new java.awt.Color(51, 51, 51));
        jLabel90.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel90.setText("Ingresar CATEGORÍA deL JUGADOR B:");
        jPanel10.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 750, -1, 30));

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel93.setText("Ingresar EQUIPO deL JUGADOR B:");
        jPanel10.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, 30));

        entradaEquipoJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaEquipoJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaEquipoJugadorB.setText("Ingresar equipo del jugador");
        entradaEquipoJugadorB.setBorder(null);
        entradaEquipoJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaEquipoJugadorBFocusLost(evt);
            }
        });
        entradaEquipoJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEquipoJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaEquipoJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, 20));
        jPanel10.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 350, 10));
        jPanel10.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 930, 350, 10));

        entradaFechaNacimientoJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaFechaNacimientoJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        entradaFechaNacimientoJugadorB.setText("Ingresar fecha de nacimiento (DD-MM-YYYY)");
        entradaFechaNacimientoJugadorB.setBorder(null);
        entradaFechaNacimientoJugadorB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoJugadorBFocusLost(evt);
            }
        });
        entradaFechaNacimientoJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFechaNacimientoJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(entradaFechaNacimientoJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 900, -1, -1));

        botonFotoJugadorB.setBackground(new java.awt.Color(36, 20, 188));
        botonFotoJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonFotoJugadorB.setForeground(new java.awt.Color(255, 255, 255));
        botonFotoJugadorB.setText("SUBIR FOTO");
        botonFotoJugadorB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonFotoJugadorBMouseMoved(evt);
            }
        });
        botonFotoJugadorB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonFotoJugadorBMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonFotoJugadorBMouseExited(evt);
            }
        });
        botonFotoJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFotoJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(botonFotoJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 970, 130, 30));

        jLabel100.setBackground(new java.awt.Color(51, 51, 51));
        jLabel100.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(102, 102, 102));
        jLabel100.setText("SUBIR FOTO DEL JUGADOR B:");
        jPanel10.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 970, -1, 30));

        jLabel102.setBackground(new java.awt.Color(51, 51, 51));
        jLabel102.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel102.setText("Ingresar fecha de nacimiento deL JUGADOR B:");
        jPanel10.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 860, -1, 30));

        opcionesCategoriaJugadorA.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        opcionesCategoriaJugadorA.setForeground(new java.awt.Color(153, 153, 153));
        opcionesCategoriaJugadorA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3era Categoria" }));
        opcionesCategoriaJugadorA.setBorder(null);
        opcionesCategoriaJugadorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriaJugadorAActionPerformed(evt);
            }
        });
        jPanel10.add(opcionesCategoriaJugadorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 790, 350, 30));

        opcionesCategoriaJugadorB.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        opcionesCategoriaJugadorB.setForeground(new java.awt.Color(153, 153, 153));
        opcionesCategoriaJugadorB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3era Categoria" }));
        opcionesCategoriaJugadorB.setBorder(null);
        opcionesCategoriaJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriaJugadorBActionPerformed(evt);
            }
        });
        jPanel10.add(opcionesCategoriaJugadorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 790, 350, 30));

        tablaDuplasAgregadas.setAutoCreateRowSorter(true);
        tablaDuplasAgregadas.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        tablaDuplasAgregadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre A", "Cedula A", "Nombre B", "Cedula B", "Categoria A", "Categoria B"
            }
        ));
        tablaDuplasAgregadas.setAutoscrolls(false);
        tablaDuplasAgregadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaDuplasAgregadas.setGridColor(new java.awt.Color(204, 204, 204));
        tablaDuplasAgregadas.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tablaDuplasAgregadas.setSelectionForeground(new java.awt.Color(30, 25, 161));
        jScrollPane37.setViewportView(tablaDuplasAgregadas);

        jPanel10.add(jScrollPane37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1170, 840, 410));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 1700));

        jScrollPane4.setViewportView(jPanel8);

        pestania.addTab("tab7", jScrollPane4);

        jScrollPane7.setBorder(null);
        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel101.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(153, 153, 153));
        jLabel101.setText("Ingresar DATOS DE LOS EQUIPOS PARTICIPANTES DEL torneo...");
        jPanel12.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel12.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
        jPanel12.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 350, 10));

        entradaNombreCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreCapitan.setText("Ingresar nombre del capitan");
        entradaNombreCapitan.setBorder(null);
        entradaNombreCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreCapitanFocusLost(evt);
            }
        });
        entradaNombreCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaNombreCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel105.setBackground(new java.awt.Color(51, 51, 51));
        jLabel105.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel105.setText("Ingresar nombre deL CAPITAN:");
        jPanel12.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 30));

        entradaCedulaCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCedulaCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaCedulaCapitan.setText("Ingresar numero de cedula capitan");
        entradaCedulaCapitan.setBorder(null);
        entradaCedulaCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCedulaCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCedulaCapitanFocusLost(evt);
            }
        });
        entradaCedulaCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCedulaCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaCedulaCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));
        jPanel12.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 350, 10));

        jLabel106.setBackground(new java.awt.Color(51, 51, 51));
        jLabel106.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel106.setText("Ingresar NÚMERO DE CEDULA DEL CAPITAN:");
        jPanel12.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, 30));
        jPanel12.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 350, 10));

        entradaNumeroTelefonoCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNumeroTelefonoCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaNumeroTelefonoCapitan.setText("Ingresar numero de telefono del capitan");
        entradaNumeroTelefonoCapitan.setBorder(null);
        entradaNumeroTelefonoCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNumeroTelefonoCapitanFocusLost(evt);
            }
        });
        entradaNumeroTelefonoCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNumeroTelefonoCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaNumeroTelefonoCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel107.setBackground(new java.awt.Color(51, 51, 51));
        jLabel107.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel107.setText("Ingresar NÚMERO DE TELEFONO deL CAPITAN:");
        jPanel12.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 30));
        jPanel12.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 350, 10));

        entradaCorreoCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCorreoCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaCorreoCapitan.setText("Ingresar correo capitan");
        entradaCorreoCapitan.setToolTipText("");
        entradaCorreoCapitan.setBorder(null);
        entradaCorreoCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCorreoCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCorreoCapitanFocusLost(evt);
            }
        });
        entradaCorreoCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCorreoCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaCorreoCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        jLabel108.setBackground(new java.awt.Color(51, 51, 51));
        jLabel108.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel108.setText("Ingresar CORREO deL CAPITAN:");
        jPanel12.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, 30));

        jLabel109.setBackground(new java.awt.Color(51, 51, 51));
        jLabel109.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel109.setText("Ingresar CATEGORÍA deL CAPITAN:");
        jPanel12.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, 30));
        jPanel12.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 350, 10));

        entradaNombreEquipo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaNombreEquipo.setForeground(new java.awt.Color(153, 153, 153));
        entradaNombreEquipo.setText("Ingresar nombre del equipo");
        entradaNombreEquipo.setBorder(null);
        entradaNombreEquipo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNombreEquipoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNombreEquipoFocusLost(evt);
            }
        });
        entradaNombreEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreEquipoActionPerformed(evt);
            }
        });
        jPanel12.add(entradaNombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        jLabel111.setBackground(new java.awt.Color(51, 51, 51));
        jLabel111.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(102, 102, 102));
        jLabel111.setText("VISTA DE JUGADORES YA AGREGADOS:");
        jPanel12.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 740, -1, 30));

        jTable5.setAutoCreateRowSorter(true);
        jTable5.setBackground(new java.awt.Color(204, 204, 204));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Cedula", "Categoria"
            }
        ));
        jScrollPane8.setViewportView(jTable5);

        jPanel12.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 780, 840, 320));

        botonFotoCapitan.setBackground(new java.awt.Color(36, 20, 188));
        botonFotoCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonFotoCapitan.setForeground(new java.awt.Color(255, 255, 255));
        botonFotoCapitan.setText("SUBIR FOTO");
        botonFotoCapitan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonFotoCapitanMouseMoved(evt);
            }
        });
        botonFotoCapitan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonFotoCapitanMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonFotoCapitanMouseExited(evt);
            }
        });
        botonFotoCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFotoCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(botonFotoCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 140, 30));

        botonRegresarIngresarDatosEquipo.setBackground(new java.awt.Color(36, 20, 188));
        botonRegresarIngresarDatosEquipo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarIngresarDatosEquipo.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarIngresarDatosEquipo.setText("REGRESAR");
        botonRegresarIngresarDatosEquipo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosEquipoMouseMoved(evt);
            }
        });
        botonRegresarIngresarDatosEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosEquipoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarIngresarDatosEquipoMouseExited(evt);
            }
        });
        botonRegresarIngresarDatosEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarIngresarDatosEquipoActionPerformed(evt);
            }
        });
        jPanel12.add(botonRegresarIngresarDatosEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 140, 40));

        botonAgregarEquipo.setBackground(new java.awt.Color(36, 20, 188));
        botonAgregarEquipo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonAgregarEquipo.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarEquipo.setText("AGREGAR EQUIPO");
        botonAgregarEquipo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonAgregarEquipoMouseMoved(evt);
            }
        });
        botonAgregarEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAgregarEquipoMouseExited(evt);
            }
        });
        botonAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEquipoActionPerformed(evt);
            }
        });
        jPanel12.add(botonAgregarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, 140, 40));

        jLabel112.setBackground(new java.awt.Color(51, 51, 51));
        jLabel112.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel112.setText("SUBIR FOTO DEL CAPITAN:");
        jPanel12.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, 30));

        jLabel113.setBackground(new java.awt.Color(51, 51, 51));
        jLabel113.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel113.setText("INGRESAR NOMBRE DEL EQUIPO:");
        jPanel12.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, 30));

        botonSeguirEquipo.setBackground(new java.awt.Color(36, 20, 188));
        botonSeguirEquipo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirEquipo.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirEquipo.setText("SEGUIR");
        botonSeguirEquipo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirEquipoMouseMoved(evt);
            }
        });
        botonSeguirEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirEquipoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirEquipoMouseExited(evt);
            }
        });
        botonSeguirEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirEquipoActionPerformed(evt);
            }
        });
        jPanel12.add(botonSeguirEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, 140, 40));
        jPanel12.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 350, 10));

        entradaFechaNacimientoCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaFechaNacimientoCapitan.setForeground(new java.awt.Color(153, 153, 153));
        entradaFechaNacimientoCapitan.setText("Ingresar fecha de nacimiento (DD-MM-YYYY)");
        entradaFechaNacimientoCapitan.setBorder(null);
        entradaFechaNacimientoCapitan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoCapitanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaFechaNacimientoCapitanFocusLost(evt);
            }
        });
        entradaFechaNacimientoCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaFechaNacimientoCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(entradaFechaNacimientoCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));

        jLabel114.setBackground(new java.awt.Color(51, 51, 51));
        jLabel114.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel114.setText("Ingresar NÚMERO DE TELEFONO deL CAPITAN:");
        jPanel12.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, 30));

        opcionesCategoriaCapitan.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        opcionesCategoriaCapitan.setForeground(new java.awt.Color(153, 153, 153));
        opcionesCategoriaCapitan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7ma Categoria", "6ta Categoria", "5ta Categoria", "4ta Categoria", "3era Categoria" }));
        opcionesCategoriaCapitan.setBorder(null);
        opcionesCategoriaCapitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCategoriaCapitanActionPerformed(evt);
            }
        });
        jPanel12.add(opcionesCategoriaCapitan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 350, 30));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 1260));

        jScrollPane7.setViewportView(jPanel11);

        pestania.addTab("tab8", jScrollPane7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonConfigurarFaseGrupos.setBackground(new java.awt.Color(30, 25, 161));
        botonConfigurarFaseGrupos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonConfigurarFaseGruposMouseMoved(evt);
            }
        });
        botonConfigurarFaseGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConfigurarFaseGruposMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonConfigurarFaseGruposMouseExited(evt);
            }
        });
        botonConfigurarFaseGrupos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel117.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("CONFIGURAR GRUPOS");
        botonConfigurarFaseGrupos.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel9.add(botonConfigurarFaseGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 160, 40));

        botonTorneoMuerteSubita.setBackground(new java.awt.Color(30, 25, 161));
        botonTorneoMuerteSubita.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonTorneoMuerteSubitaMouseMoved(evt);
            }
        });
        botonTorneoMuerteSubita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTorneoMuerteSubitaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonTorneoMuerteSubitaMouseExited(evt);
            }
        });
        botonTorneoMuerteSubita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel122.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("CREAR TORNEO");
        botonTorneoMuerteSubita.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel35.setBackground(new java.awt.Color(30, 25, 161));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel123.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("CREAR TORNEO");
        jPanel35.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonTorneoMuerteSubita.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel9.add(botonTorneoMuerteSubita, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 130, 40));

        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trofeoWimbledon.png"))); // NOI18N
        jLabel125.setToolTipText("");
        jLabel125.setAutoscrolls(true);
        jPanel9.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 230, 150));

        jLabel110.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("CREAR TORNEO");
        jPanel9.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel115.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(153, 153, 153));
        jLabel115.setText("Formato Liga");
        jPanel9.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, 60));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TrofeoUSOpen.jpg"))); // NOI18N
        jLabel116.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel9.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, 150));

        jLabel118.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(153, 153, 153));
        jLabel118.setText("Fase de grupos");
        jPanel9.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 60));

        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trofeoATPFinals.jpg"))); // NOI18N
        jLabel119.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel9.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 230, 180));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel9.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 315, 389));

        jLabel124.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(153, 153, 153));
        jLabel124.setText("SUBITA");
        jPanel9.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, -1, 60));

        botonFormatoLiga.setBackground(new java.awt.Color(30, 25, 161));
        botonFormatoLiga.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonFormatoLigaMouseMoved(evt);
            }
        });
        botonFormatoLiga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonFormatoLigaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonFormatoLigaMouseExited(evt);
            }
        });
        botonFormatoLiga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel126.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setText("CREAR TORNEO");
        botonFormatoLiga.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel37.setBackground(new java.awt.Color(30, 25, 161));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel127.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setText("CREAR TORNEO");
        jPanel37.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        botonFormatoLiga.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 130, 40));

        jPanel9.add(botonFormatoLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 130, 40));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel9.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 315, 389));

        jLabel128.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(153, 153, 153));
        jLabel128.setText("Escoge el formato de TU torneo...");
        jPanel9.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 60));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel9.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel130.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(153, 153, 153));
        jLabel130.setText("Torneo a muerte");
        jPanel9.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, 60));

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjeta.png"))); // NOI18N
        jPanel9.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 315, 389));

        pestania.addTab("tab9", jPanel9);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel131.setBackground(new java.awt.Color(51, 51, 51));
        jLabel131.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel131.setText("Ingresar CANTIDAD DE GRUPOS EN EL TORNEO:");
        jPanel13.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));
        jPanel13.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 10));
        jPanel13.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 490, 10));

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel13.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel136.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(153, 153, 153));
        jLabel136.setText("Configurar fase de grupos...");
        jPanel13.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 60));

        entradaCantidadJugadoresPorGrupo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCantidadJugadoresPorGrupo.setForeground(new java.awt.Color(153, 153, 153));
        entradaCantidadJugadoresPorGrupo.setText("Ingresar un numero");
        entradaCantidadJugadoresPorGrupo.setBorder(null);
        entradaCantidadJugadoresPorGrupo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresPorGrupoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresPorGrupoFocusLost(evt);
            }
        });
        entradaCantidadJugadoresPorGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCantidadJugadoresPorGrupoActionPerformed(evt);
            }
        });
        jPanel13.add(entradaCantidadJugadoresPorGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jLabel137.setBackground(new java.awt.Color(51, 51, 51));
        jLabel137.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel137.setText("INGRESAR CANTIDAD DE JUGADORES/DUPLAS/equipos POR GRUPO: ");
        jPanel13.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, 30));

        ingresarCantidadDeGrupos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        ingresarCantidadDeGrupos.setForeground(new java.awt.Color(153, 153, 153));
        ingresarCantidadDeGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dos grupos", "Tres grupos", "Cuatro grupos", "Cinco grupos", "Seis grupos" }));
        ingresarCantidadDeGrupos.setToolTipText("");
        ingresarCantidadDeGrupos.setBorder(null);
        ingresarCantidadDeGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarCantidadDeGruposActionPerformed(evt);
            }
        });
        jPanel13.add(ingresarCantidadDeGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 350, 30));

        botonSeguirFaseGrupos.setBackground(new java.awt.Color(30, 25, 161));
        botonSeguirFaseGrupos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonSeguirFaseGrupos.setForeground(new java.awt.Color(255, 255, 255));
        botonSeguirFaseGrupos.setText("crear torneo");
        botonSeguirFaseGrupos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSeguirFaseGruposMouseMoved(evt);
            }
        });
        botonSeguirFaseGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSeguirFaseGruposMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSeguirFaseGruposMouseExited(evt);
            }
        });
        botonSeguirFaseGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeguirFaseGruposActionPerformed(evt);
            }
        });
        jPanel13.add(botonSeguirFaseGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 140, 40));

        botonRegresarConfigurarFaseGrupos.setBackground(new java.awt.Color(30, 25, 161));
        botonRegresarConfigurarFaseGrupos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        botonRegresarConfigurarFaseGrupos.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresarConfigurarFaseGrupos.setText("REGRESAR");
        botonRegresarConfigurarFaseGrupos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegresarConfigurarFaseGruposMouseMoved(evt);
            }
        });
        botonRegresarConfigurarFaseGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarConfigurarFaseGruposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegresarConfigurarFaseGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresarConfigurarFaseGruposMouseExited(evt);
            }
        });
        botonRegresarConfigurarFaseGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarConfigurarFaseGruposActionPerformed(evt);
            }
        });
        jPanel13.add(botonRegresarConfigurarFaseGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 140, 40));

        jLabel138.setBackground(new java.awt.Color(51, 51, 51));
        jLabel138.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel138.setText("INGRESAR cuantos pasaran a la ronda de eliminacion driecta: ");
        jPanel13.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, 30));

        entradaCantidadJugadoresEliminacionDirecta.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        entradaCantidadJugadoresEliminacionDirecta.setForeground(new java.awt.Color(153, 153, 153));
        entradaCantidadJugadoresEliminacionDirecta.setText("Ingresar un numero");
        entradaCantidadJugadoresEliminacionDirecta.setBorder(null);
        entradaCantidadJugadoresEliminacionDirecta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresEliminacionDirectaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaCantidadJugadoresEliminacionDirectaFocusLost(evt);
            }
        });
        entradaCantidadJugadoresEliminacionDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaCantidadJugadoresEliminacionDirectaActionPerformed(evt);
            }
        });
        jPanel13.add(entradaCantidadJugadoresEliminacionDirecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));
        jPanel13.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 490, 10));

        pestania.addTab("tab10", jPanel13);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(1010, 1850));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaGeneralLiga.setAutoCreateRowSorter(true);
        tablaGeneralLiga.setBackground(new java.awt.Color(204, 204, 204));
        tablaGeneralLiga.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaGeneralLiga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaGeneralLiga.setAutoscrolls(false);
        tablaGeneralLiga.setGridColor(new java.awt.Color(0, 0, 255));
        tablaGeneralLiga.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane36.setViewportView(tablaGeneralLiga);

        jPanel16.add(jScrollPane36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, 390));

        jSeparator27.setForeground(new java.awt.Color(0, 0, 0));
        jPanel16.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel134.setBackground(new java.awt.Color(255, 255, 255));
        jLabel134.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel134.setText("tabla general");
        jPanel16.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        jLabel141.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(153, 153, 153));
        jLabel141.setText("Torneo 0");
        jPanel16.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 60));

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel16.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel143.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(153, 153, 153));
        jLabel143.setText("Bienvenido al torneo");
        jPanel16.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        pestania.addTab("tab11", jPanel16);

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setBorder(null);
        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(1010, 1850));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados1.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados1.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados1.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados1.setAutoscrolls(false);
        tablaJugadoresAgregados1.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados1.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane10.setViewportView(tablaJugadoresAgregados1);

        jPanel17.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel139.setBackground(new java.awt.Color(255, 255, 255));
        jLabel139.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel139.setText("grupo a");
        jPanel17.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados2.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados2.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados2.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados2.setAutoscrolls(false);
        tablaJugadoresAgregados2.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados2.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane11.setViewportView(tablaJugadoresAgregados2);

        jPanel17.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel140.setBackground(new java.awt.Color(255, 255, 255));
        jLabel140.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel140.setText("grupo b");
        jPanel17.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        tablaJugadoresAgregados3.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados3.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados3.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados3.setAutoscrolls(false);
        tablaJugadoresAgregados3.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados3.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane12.setViewportView(tablaJugadoresAgregados3);

        jPanel17.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1360, 940, 430));

        jSeparator35.setForeground(new java.awt.Color(0, 0, 0));
        jPanel17.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1340, 940, 30));

        jLabel144.setBackground(new java.awt.Color(255, 255, 255));
        jLabel144.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel144.setText("Tabla General");
        jPanel17.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1290, -1, 60));

        jLabel145.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(153, 153, 153));
        jLabel145.setText("Torneo 1");
        jPanel17.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 60));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel17.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel244.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel244.setForeground(new java.awt.Color(153, 153, 153));
        jLabel244.setText("Bienvenido al torneo");
        jPanel17.add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        jPanel3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 1800));

        jScrollPane9.setViewportView(jPanel3);

        pestania.addTab("tab12", jScrollPane9);

        jScrollPane13.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane13.setBorder(null);
        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setPreferredSize(new java.awt.Dimension(1010, 2397));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados4.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados4.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados4.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados4.setAutoscrolls(false);
        tablaJugadoresAgregados4.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados4.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane14.setViewportView(tablaJugadoresAgregados4);

        jPanel26.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator40.setForeground(new java.awt.Color(0, 0, 0));
        jPanel26.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel245.setBackground(new java.awt.Color(255, 255, 255));
        jLabel245.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel245.setText("grupo a");
        jPanel26.add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados5.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados5.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados5.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados5.setAutoscrolls(false);
        tablaJugadoresAgregados5.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados5.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane15.setViewportView(tablaJugadoresAgregados5);

        jPanel26.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator43.setForeground(new java.awt.Color(0, 0, 0));
        jPanel26.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel246.setBackground(new java.awt.Color(255, 255, 255));
        jLabel246.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel246.setText("grupo b");
        jPanel26.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        jLabel247.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel247.setForeground(new java.awt.Color(153, 153, 153));
        jLabel247.setText("Torneo 2");
        jPanel26.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 60));

        jLabel248.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel26.add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel249.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel249.setForeground(new java.awt.Color(153, 153, 153));
        jLabel249.setText("Bienvenido al torneo");
        jPanel26.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        tablaJugadoresAgregados7.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados7.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados7.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados7.setAutoscrolls(false);
        tablaJugadoresAgregados7.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados7.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane16.setViewportView(tablaJugadoresAgregados7);

        jPanel26.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        tablaJugadoresAgregados8.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados8.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados8.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados8.setAutoscrolls(false);
        tablaJugadoresAgregados8.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados8.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane17.setViewportView(tablaJugadoresAgregados8);

        jPanel26.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1370, 940, -1));

        jSeparator44.setForeground(new java.awt.Color(0, 0, 0));
        jPanel26.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1350, 940, 30));

        jLabel250.setBackground(new java.awt.Color(255, 255, 255));
        jLabel250.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel250.setText("Grupo C");
        jPanel26.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1300, -1, 60));

        tablaJugadoresAgregados9.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados9.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados9.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados9.setAutoscrolls(false);
        tablaJugadoresAgregados9.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados9.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane18.setViewportView(tablaJugadoresAgregados9);

        jPanel26.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1920, 940, -1));

        jSeparator45.setForeground(new java.awt.Color(0, 0, 0));
        jPanel26.add(jSeparator45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1900, 940, 30));

        jLabel251.setBackground(new java.awt.Color(255, 255, 255));
        jLabel251.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel251.setText("TABLA GENERAL");
        jPanel26.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1850, -1, 60));

        jPanel18.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1030, 2400));

        jScrollPane13.setViewportView(jPanel18);

        pestania.addTab("tab13", jScrollPane13);

        jScrollPane19.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane19.setBorder(null);
        jScrollPane19.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane19.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setPreferredSize(new java.awt.Dimension(11010, 3000));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados6.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados6.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados6.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados6.setAutoscrolls(false);
        tablaJugadoresAgregados6.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados6.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane20.setViewportView(tablaJugadoresAgregados6);

        jPanel28.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator46.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel252.setBackground(new java.awt.Color(255, 255, 255));
        jLabel252.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel252.setText("grupo a");
        jPanel28.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados10.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados10.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados10.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados10.setAutoscrolls(false);
        tablaJugadoresAgregados10.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados10.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane21.setViewportView(tablaJugadoresAgregados10);

        jPanel28.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator47.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel253.setBackground(new java.awt.Color(255, 255, 255));
        jLabel253.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel253.setText("grupo b");
        jPanel28.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        jLabel254.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel254.setForeground(new java.awt.Color(153, 153, 153));
        jLabel254.setText("Torneo 3");
        jPanel28.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 60));

        jLabel255.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel28.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel256.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel256.setForeground(new java.awt.Color(153, 153, 153));
        jLabel256.setText("Bienvenido al torneo");
        jPanel28.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        tablaJugadoresAgregados11.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados11.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados11.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados11.setAutoscrolls(false);
        tablaJugadoresAgregados11.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados11.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane22.setViewportView(tablaJugadoresAgregados11);

        jPanel28.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        tablaJugadoresAgregados12.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados12.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados12.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados12.setAutoscrolls(false);
        tablaJugadoresAgregados12.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados12.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane23.setViewportView(tablaJugadoresAgregados12);

        jPanel28.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1370, 940, -1));

        jSeparator48.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1350, 940, 30));

        jLabel257.setBackground(new java.awt.Color(255, 255, 255));
        jLabel257.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel257.setText("Grupo C");
        jPanel28.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1300, -1, 60));

        tablaJugadoresAgregados13.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados13.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados13.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados13.setAutoscrolls(false);
        tablaJugadoresAgregados13.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados13.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane24.setViewportView(tablaJugadoresAgregados13);

        jPanel28.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1920, 940, -1));

        jSeparator49.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1900, 940, 30));

        jLabel258.setBackground(new java.awt.Color(255, 255, 255));
        jLabel258.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel258.setText("gRUPO D");
        jPanel28.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1850, -1, 60));

        tablaJugadoresAgregados14.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados14.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados14.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados14.setAutoscrolls(false);
        tablaJugadoresAgregados14.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados14.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane25.setViewportView(tablaJugadoresAgregados14);

        jPanel28.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2480, 940, 470));

        jSeparator50.setForeground(new java.awt.Color(0, 0, 0));
        jPanel28.add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2460, 940, 30));

        jLabel259.setBackground(new java.awt.Color(255, 255, 255));
        jLabel259.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel259.setText("TABLA GENERAL");
        jPanel28.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2410, -1, 60));

        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 3000));

        jScrollPane19.setViewportView(jPanel27);

        pestania.addTab("tab14", jScrollPane19);

        jScrollPane26.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane26.setBorder(null);
        jScrollPane26.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane26.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setPreferredSize(new java.awt.Dimension(11010, 3500));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados15.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados15.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados15.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados15.setAutoscrolls(false);
        tablaJugadoresAgregados15.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados15.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane27.setViewportView(tablaJugadoresAgregados15);

        jPanel52.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator51.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel260.setBackground(new java.awt.Color(255, 255, 255));
        jLabel260.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel260.setText("grupo a");
        jPanel52.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados16.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados16.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados16.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados16.setAutoscrolls(false);
        tablaJugadoresAgregados16.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados16.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane28.setViewportView(tablaJugadoresAgregados16);

        jPanel52.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator52.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel261.setBackground(new java.awt.Color(255, 255, 255));
        jLabel261.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel261.setText("grupo b");
        jPanel52.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        jLabel262.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(153, 153, 153));
        jLabel262.setText("Torneo 4");
        jPanel52.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 60));

        jLabel263.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel52.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel264.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(153, 153, 153));
        jLabel264.setText("Bienvenido al torneo");
        jPanel52.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        tablaJugadoresAgregados17.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados17.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados17.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados17.setAutoscrolls(false);
        tablaJugadoresAgregados17.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados17.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane29.setViewportView(tablaJugadoresAgregados17);

        jPanel52.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        tablaJugadoresAgregados18.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados18.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados18.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados18.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados18.setAutoscrolls(false);
        tablaJugadoresAgregados18.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados18.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane30.setViewportView(tablaJugadoresAgregados18);

        jPanel52.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1370, 940, -1));

        jSeparator53.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1350, 940, 30));

        jLabel265.setBackground(new java.awt.Color(255, 255, 255));
        jLabel265.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel265.setText("Grupo C");
        jPanel52.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1300, -1, 60));

        jSeparator54.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1900, 940, 30));

        jLabel266.setBackground(new java.awt.Color(255, 255, 255));
        jLabel266.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel266.setText("gRUPO D");
        jPanel52.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1850, -1, 60));

        tablaJugadoresAgregados20.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados20.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados20.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados20.setAutoscrolls(false);
        tablaJugadoresAgregados20.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados20.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane31.setViewportView(tablaJugadoresAgregados20);

        jPanel52.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2990, 940, 470));

        jSeparator55.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2970, 940, 30));

        jLabel267.setBackground(new java.awt.Color(255, 255, 255));
        jLabel267.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel267.setText("TABLA GENERAL");
        jPanel52.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2920, -1, 60));

        tablaJugadoresAgregados21.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados21.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados21.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados21.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados21.setAutoscrolls(false);
        tablaJugadoresAgregados21.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados21.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane32.setViewportView(tablaJugadoresAgregados21);

        jPanel52.add(jScrollPane32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1920, 940, -1));

        tablaJugadoresAgregados22.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados22.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados22.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados22.setAutoscrolls(false);
        tablaJugadoresAgregados22.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados22.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane33.setViewportView(tablaJugadoresAgregados22);

        jPanel52.add(jScrollPane33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2440, 940, -1));

        jSeparator56.setForeground(new java.awt.Color(0, 0, 0));
        jPanel52.add(jSeparator56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2420, 940, 30));

        jLabel268.setBackground(new java.awt.Color(255, 255, 255));
        jLabel268.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel268.setText("Grupo E");
        jPanel52.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2370, -1, 60));

        jPanel33.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 3500));

        jScrollPane26.setViewportView(jPanel33);

        pestania.addTab("tab15", jScrollPane26);

        jScrollPane43.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane43.setBorder(null);
        jScrollPane43.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane43.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setPreferredSize(new java.awt.Dimension(11010, 4000));
        jPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaJugadoresAgregados19.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados19.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados19.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados19.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados19.setAutoscrolls(false);
        tablaJugadoresAgregados19.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados19.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane44.setViewportView(tablaJugadoresAgregados19);

        jPanel56.add(jScrollPane44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 940, -1));

        jSeparator63.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 940, 30));

        jLabel278.setBackground(new java.awt.Color(255, 255, 255));
        jLabel278.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel278.setText("grupo a");
        jPanel56.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        tablaJugadoresAgregados23.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados23.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados23.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados23.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados23.setAutoscrolls(false);
        tablaJugadoresAgregados23.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados23.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane45.setViewportView(tablaJugadoresAgregados23);

        jPanel56.add(jScrollPane45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        jSeparator64.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 940, 30));

        jLabel279.setBackground(new java.awt.Color(255, 255, 255));
        jLabel279.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel279.setText("grupo b");
        jPanel56.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, 60));

        jLabel280.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel280.setForeground(new java.awt.Color(153, 153, 153));
        jLabel280.setText("Torneo 5");
        jPanel56.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 60));

        jLabel281.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tamanacoLogoPequenio.png"))); // NOI18N
        jPanel56.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel282.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel282.setForeground(new java.awt.Color(153, 153, 153));
        jLabel282.setText("Bienvenido al torneo");
        jPanel56.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 60));

        tablaJugadoresAgregados24.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados24.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados24.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados24.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados24.setAutoscrolls(false);
        tablaJugadoresAgregados24.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados24.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane46.setViewportView(tablaJugadoresAgregados24);

        jPanel56.add(jScrollPane46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, 940, -1));

        tablaJugadoresAgregados25.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados25.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados25.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados25.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados25.setAutoscrolls(false);
        tablaJugadoresAgregados25.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados25.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane47.setViewportView(tablaJugadoresAgregados25);

        jPanel56.add(jScrollPane47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1370, 940, -1));

        jSeparator65.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator65, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1350, 940, 30));

        jLabel283.setBackground(new java.awt.Color(255, 255, 255));
        jLabel283.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel283.setText("Grupo C");
        jPanel56.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1300, -1, 60));

        jSeparator66.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1900, 940, 30));

        jLabel284.setBackground(new java.awt.Color(255, 255, 255));
        jLabel284.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel284.setText("gRUPO D");
        jPanel56.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1850, -1, 60));

        tablaJugadoresAgregados26.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados26.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados26.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados26.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados26.setAutoscrolls(false);
        tablaJugadoresAgregados26.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados26.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane48.setViewportView(tablaJugadoresAgregados26);

        jPanel56.add(jScrollPane48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 3500, 940, 470));

        jSeparator67.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 3480, 940, 30));

        jLabel285.setBackground(new java.awt.Color(255, 255, 255));
        jLabel285.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel285.setText("TABLA GENERAL");
        jPanel56.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3430, -1, 60));

        tablaJugadoresAgregados27.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados27.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados27.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados27.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados27.setAutoscrolls(false);
        tablaJugadoresAgregados27.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados27.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane49.setViewportView(tablaJugadoresAgregados27);

        jPanel56.add(jScrollPane49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1920, 940, -1));

        tablaJugadoresAgregados28.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados28.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados28.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados28.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados28.setAutoscrolls(false);
        tablaJugadoresAgregados28.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados28.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane34.setViewportView(tablaJugadoresAgregados28);

        jPanel56.add(jScrollPane34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2440, 940, -1));

        jSeparator68.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator68, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2420, 940, 30));

        jLabel286.setBackground(new java.awt.Color(255, 255, 255));
        jLabel286.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel286.setText("Grupo E");
        jPanel56.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2370, -1, 60));

        tablaJugadoresAgregados29.setAutoCreateRowSorter(true);
        tablaJugadoresAgregados29.setBackground(new java.awt.Color(204, 204, 204));
        tablaJugadoresAgregados29.setFont(new java.awt.Font("Bebas Neue", 0, 14)); // NOI18N
        tablaJugadoresAgregados29.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "PJ", "PG", "PP", "P Ave", "Set G", "Set P", "Set Ave", "GG", "GP", "G Ave"
            }
        ));
        tablaJugadoresAgregados29.setAutoscrolls(false);
        tablaJugadoresAgregados29.setGridColor(new java.awt.Color(0, 0, 255));
        tablaJugadoresAgregados29.setSelectionForeground(new java.awt.Color(102, 0, 102));
        jScrollPane35.setViewportView(tablaJugadoresAgregados29);

        jPanel56.add(jScrollPane35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2970, 940, -1));

        jSeparator69.setForeground(new java.awt.Color(0, 0, 0));
        jPanel56.add(jSeparator69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2950, 940, 30));

        jLabel287.setBackground(new java.awt.Color(255, 255, 255));
        jLabel287.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel287.setText("Grupo F");
        jPanel56.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 2900, -1, 60));

        jPanel55.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 4000));

        jScrollPane43.setViewportView(jPanel55);

        pestania.addTab("tab16", jScrollPane43);

        jPanel1.add(pestania, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1070, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuVerTorneosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuVerTorneosMouseClicked
        pestania.setSelectedIndex(1);
        tituloSuperior.setText("Ver Torneos en curso");
        iconoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoTorneoEnCursoMasGrande.png")));
    }//GEN-LAST:event_botonMenuVerTorneosMouseClicked

    private void botonMenuVerTorneosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuVerTorneosMouseMoved
        changePanelColor(botonMenuVerTorneos,250,250,250);
    }//GEN-LAST:event_botonMenuVerTorneosMouseMoved

    private void botonMenuVerTorneosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuVerTorneosMouseExited
        changePanelColor(botonMenuVerTorneos,204,204,255);
    }//GEN-LAST:event_botonMenuVerTorneosMouseExited

    private void botonSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalidaMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void entradaFechaNacimientoCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoCapitanActionPerformed

    private void botonSeguirEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirEquipoActionPerformed

    private void botonAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarEquipoActionPerformed

    private void botonRegresarIngresarDatosEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosEquipoActionPerformed

    private void botonRegresarIngresarDatosEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosEquipoMouseClicked
        pestania.setSelectedIndex(4);
    }//GEN-LAST:event_botonRegresarIngresarDatosEquipoMouseClicked

    private void botonFotoCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFotoCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFotoCapitanActionPerformed

    private void botonFotoCapitanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFotoCapitanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFotoCapitanMouseClicked

    private void entradaNombreEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreEquipoActionPerformed

    private void entradaCorreoCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCorreoCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCorreoCapitanActionPerformed

    private void entradaNumeroTelefonoCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumeroTelefonoCapitanActionPerformed

    private void entradaCedulaCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCedulaCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCedulaCapitanActionPerformed

    private void entradaNombreCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreCapitanActionPerformed

    private void opcionesCategoriaJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriaJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesCategoriaJugadorBActionPerformed

    private void opcionesCategoriaJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriaJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesCategoriaJugadorAActionPerformed

    private void botonFotoJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFotoJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFotoJugadorBActionPerformed

    private void botonFotoJugadorBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFotoJugadorBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFotoJugadorBMouseClicked

    private void entradaFechaNacimientoJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoJugadorBActionPerformed

    private void entradaEquipoJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEquipoJugadorBActionPerformed

    private void entradaEmailJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEmailJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEmailJugadorBActionPerformed

    private void entradaEmailJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorBFocusLost
        organizatorFocusLost(entradaEmailJugadorB, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorBFocusLost

    private void entradaEmailJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorBFocusGained
        organizatorFocusGained (entradaEmailJugadorB, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorBFocusGained

    private void entradaNumeroTelefonoJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorBActionPerformed

    private void entradaIdJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaIdJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaIdJugadorBActionPerformed

    private void entradaIdJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIdJugadorBFocusLost
        organizatorFocusLost(entradaIdJugadorB, "Ingresar numero de cedula jugador");
    }//GEN-LAST:event_entradaIdJugadorBFocusLost

    private void entradaIdJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIdJugadorBFocusGained
        organizatorFocusGained (entradaIdJugadorB, "Ingresar numero de cedula jugador");
    }//GEN-LAST:event_entradaIdJugadorBFocusGained

    private void entradaNombreJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreJugadorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreJugadorBActionPerformed

    private void entradaNombreJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorBFocusLost
        organizatorFocusLost(entradaNombreJugadorB, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorBFocusLost

    private void entradaNombreJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorBFocusGained
        organizatorFocusGained (entradaNombreJugadorB, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorBFocusGained

    private void botonSeguirDuplasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirDuplasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirDuplasActionPerformed

    private void botonAgregarJugadoresDuplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarJugadoresDuplaActionPerformed
        Player playerA = new Player();
        Player playerB = new Player();
        playerA.readPlayer(entradaNombreJugadorA, entradaIdJugadorA, entradaNumeroTelefonoJugadorA, entradaEmailJugadorA, opcionesCategoriaJugadorA, entradaEquipoJugadorA, entradaFechaNacimientoJugadorA);
        playerB.readPlayer(entradaNombreJugadorB, entradaIdJugadorB, entradaNumeroTelefonoJugadorB, entradaEmailJugadorB, opcionesCategoriaJugadorB, entradaEquipoJugadorB, entradaFechaNacimientoJugadorB);    
        
        cellsDoubles[0] = playerA.getName();
        cellsDoubles[1] = playerA.getId();
        cellsDoubles[2] = playerB.getName();
        cellsDoubles[3] = playerB.getId();
        cellsDoubles[4] = playerA.getCategory();
        cellsDoubles[5] = playerB.getCategory();
        tablaDuplasIngresados.addRow(cellsDoubles);
    }//GEN-LAST:event_botonAgregarJugadoresDuplaActionPerformed

    private void botonRegresarIngresarDatosDoblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosDoblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosDoblesActionPerformed

    private void botonRegresarIngresarDatosDoblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosDoblesMouseClicked
        pestania.setSelectedIndex(4);
    }//GEN-LAST:event_botonRegresarIngresarDatosDoblesMouseClicked

    private void botonFotoJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFotoJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFotoJugadorAActionPerformed

    private void botonFotoJugadorAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFotoJugadorAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFotoJugadorAMouseClicked

    private void entradaFechaNacimientoJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoJugadorAActionPerformed

    private void entradaEquipoJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEquipoJugadorAActionPerformed

    private void entradaEquipoJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorAFocusLost
        organizatorFocusLost(entradaEquipoJugadorA, "Ingresar equipo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorAFocusLost

    private void entradaEquipoJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorAFocusGained
        organizatorFocusGained (entradaEquipoJugadorA, "Ingresar equipo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorAFocusGained

    private void entradaEmailJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEmailJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEmailJugadorAActionPerformed

    private void entradaEmailJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorAFocusLost
        organizatorFocusLost(entradaEmailJugadorA, "Ingresar correo jugador");
    }//GEN-LAST:event_entradaEmailJugadorAFocusLost

    private void entradaEmailJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorAFocusGained
        organizatorFocusGained (entradaEmailJugadorA, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorAFocusGained

    private void entradaNumeroTelefonoJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorAActionPerformed

    private void entradaIdJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaIdJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaIdJugadorAActionPerformed

    private void entradaIdJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIdJugadorAFocusLost
        organizatorFocusLost(entradaIdJugadorA, "Ingresar numero de cedula jugador");
    }//GEN-LAST:event_entradaIdJugadorAFocusLost

    private void entradaIdJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIdJugadorAFocusGained
        organizatorFocusGained (entradaIdJugadorA, "Ingresar numero de cedula jugador");
    }//GEN-LAST:event_entradaIdJugadorAFocusGained

    private void entradaNombreJugadorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreJugadorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreJugadorAActionPerformed

    private void entradaNombreJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorAFocusLost
        organizatorFocusLost(entradaNombreJugadorA, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorAFocusLost

    private void entradaNombreJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorAFocusGained
        organizatorFocusGained (entradaNombreJugadorA, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorAFocusGained

    private void opcionesCategoriaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriaJugadorActionPerformed

    }//GEN-LAST:event_opcionesCategoriaJugadorActionPerformed

    private void botonSeguirIngresarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirIngresarJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarJugadorActionPerformed

    private void botonAgregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarJugadorActionPerformed
        Player player = new Player();
        player.readPlayer(mostrarNombre, entradaIDJugador, entradaNumeroTelefonoJugador, entradaEmailJugador, opcionesCategoriaJugador, entradaEquipoJugador, entradaFechaNacimientoJugador);
        newTournament.addPlayerTournament(player);
        cellsSingle[0] = player.getName();
        cellsSingle[1] = player.getId();
        cellsSingle[2] = player.getPhoneNumber();
        cellsSingle[3] = player.getCategory();
        tablaJugadoresIngresados.addRow(cellsSingle);
    }//GEN-LAST:event_botonAgregarJugadorActionPerformed

    private void botonAgregarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarJugadorMouseClicked

    private void botonRegresarIngresarDatosSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosSingleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosSingleActionPerformed

    private void botonRegresarIngresarDatosSingleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosSingleMouseClicked
        pestania.setSelectedIndex(4);
    }//GEN-LAST:event_botonRegresarIngresarDatosSingleMouseClicked

    private void botonSubirFotoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirFotoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSubirFotoJugadorActionPerformed

    private void botonSubirFotoJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirFotoJugadorMouseClicked

    }//GEN-LAST:event_botonSubirFotoJugadorMouseClicked

    private void entradaFechaNacimientoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaFechaNacimientoJugadorActionPerformed

    private void entradaEquipoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEquipoJugadorActionPerformed

    private void entradaEmailJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEmailJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaEmailJugadorActionPerformed

    private void entradaNumeroTelefonoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorActionPerformed

    private void entradaIDJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaIDJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaIDJugadorActionPerformed

    private void entradaNombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreJugadorActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void mostrarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarNombreActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void textoBuscarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBuscarJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBuscarJugadorActionPerformed

    private void textoBuscarJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoBuscarJugadorFocusLost
        organizatorFocusLost (textoBuscarJugador, "Ingresar cedula del jugador a buscar...");
    }//GEN-LAST:event_textoBuscarJugadorFocusLost

    private void textoBuscarJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoBuscarJugadorFocusGained
        organizatorFocusGained (textoBuscarJugador, "Ingresar cedula del jugador a buscar...");
    }//GEN-LAST:event_textoBuscarJugadorFocusGained

    private void entradaEquipoJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorBFocusGained
        organizatorFocusGained (entradaEquipoJugadorB, "Ingresar equipo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorBFocusGained

    private void entradaEquipoJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorBFocusLost
        organizatorFocusLost (entradaEquipoJugadorB, "Ingresar equipo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorBFocusLost

    private void entradaNumeroTelefonoJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorAFocusGained
        organizatorFocusGained (entradaNumeroTelefonoJugadorA, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorAFocusGained

    private void entradaNumeroTelefonoJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorAFocusLost
        organizatorFocusLost (entradaNumeroTelefonoJugadorA, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorAFocusLost

    private void entradaNumeroTelefonoJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorBFocusGained
        organizatorFocusGained (entradaNumeroTelefonoJugadorB, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorBFocusGained

    private void entradaNumeroTelefonoJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorBFocusLost
        organizatorFocusLost (entradaNumeroTelefonoJugadorB, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorBFocusLost

    private void entradaFechaNacimientoJugadorAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorAFocusGained
        organizatorFocusGained (entradaFechaNacimientoJugadorA, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorAFocusGained

    private void entradaFechaNacimientoJugadorAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorAFocusLost
        organizatorFocusLost (entradaFechaNacimientoJugadorA, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorAFocusLost

    private void entradaFechaNacimientoJugadorBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorBFocusGained
        organizatorFocusGained (entradaFechaNacimientoJugadorB, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorBFocusGained

    private void entradaFechaNacimientoJugadorBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorBFocusLost
        organizatorFocusLost (entradaFechaNacimientoJugadorB, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorBFocusLost

    private void entradaNombreJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorFocusGained
        organizatorFocusGained (entradaNombreJugador, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorFocusGained

    private void entradaNombreJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreJugadorFocusLost
        organizatorFocusLost (entradaNombreJugador, "Ingresar nombre del jugador");
    }//GEN-LAST:event_entradaNombreJugadorFocusLost

    private void entradaIDJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIDJugadorFocusGained
        organizatorFocusGained (entradaIDJugador, "Ingresar numero de cedula del jugador");
    }//GEN-LAST:event_entradaIDJugadorFocusGained

    private void entradaIDJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaIDJugadorFocusLost
        organizatorFocusLost (entradaIDJugador, "Ingresar numero de cedula del jugador");
    }//GEN-LAST:event_entradaIDJugadorFocusLost

    private void entradaNumeroTelefonoJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorFocusGained
        organizatorFocusGained (entradaNumeroTelefonoJugador, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorFocusGained

    private void entradaNumeroTelefonoJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoJugadorFocusLost
        organizatorFocusLost (entradaNumeroTelefonoJugador, "Ingresar numero de telefono del jugador");
    }//GEN-LAST:event_entradaNumeroTelefonoJugadorFocusLost

    private void entradaEmailJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorFocusGained
        organizatorFocusGained (entradaEmailJugador, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorFocusGained

    private void entradaEmailJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEmailJugadorFocusLost
        organizatorFocusLost (entradaEmailJugador, "Ingresar correo del jugador");
    }//GEN-LAST:event_entradaEmailJugadorFocusLost

    private void entradaEquipoJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorFocusGained
        organizatorFocusGained (entradaEquipoJugador, "Ingresar equipo externo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorFocusGained

    private void entradaEquipoJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaEquipoJugadorFocusLost
        organizatorFocusLost (entradaEquipoJugador, "Ingresar equipo externo del jugador");
    }//GEN-LAST:event_entradaEquipoJugadorFocusLost

    private void entradaFechaNacimientoJugadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorFocusGained
        organizatorFocusGained (entradaFechaNacimientoJugador, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorFocusGained

    private void entradaFechaNacimientoJugadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoJugadorFocusLost
        organizatorFocusLost (entradaFechaNacimientoJugador, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoJugadorFocusLost

    private void opcionesCategoriaCapitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCategoriaCapitanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionesCategoriaCapitanActionPerformed

    private void entradaNumeroTelefonoCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoCapitanFocusGained
        organizatorFocusGained (entradaNumeroTelefonoCapitan, "Ingresar numero de telefono del capitan");
    }//GEN-LAST:event_entradaNumeroTelefonoCapitanFocusGained

    private void entradaNumeroTelefonoCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNumeroTelefonoCapitanFocusLost
        organizatorFocusLost (entradaNumeroTelefonoCapitan, "Ingresar numero de telefono del capitan");
    }//GEN-LAST:event_entradaNumeroTelefonoCapitanFocusLost

    private void entradaCorreoCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCorreoCapitanFocusGained
        organizatorFocusGained (entradaCorreoCapitan, "Ingresar correo capitan");
    }//GEN-LAST:event_entradaCorreoCapitanFocusGained

    private void entradaCorreoCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCorreoCapitanFocusLost
        organizatorFocusLost (entradaCorreoCapitan, "Ingresar correo capitan");
    }//GEN-LAST:event_entradaCorreoCapitanFocusLost

    private void entradaFechaNacimientoCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoCapitanFocusGained
        organizatorFocusGained (entradaFechaNacimientoCapitan, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoCapitanFocusGained

    private void entradaFechaNacimientoCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaFechaNacimientoCapitanFocusLost
        organizatorFocusLost (entradaFechaNacimientoCapitan, "Ingresar fecha de nacimiento (DD-MM-YYYY)");
    }//GEN-LAST:event_entradaFechaNacimientoCapitanFocusLost

    private void entradaNombreEquipoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreEquipoFocusGained
        organizatorFocusGained (entradaNombreEquipo, "Ingresar nombre del equipo");
    }//GEN-LAST:event_entradaNombreEquipoFocusGained

    private void entradaNombreEquipoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreEquipoFocusLost
        organizatorFocusLost (entradaNombreEquipo, "Ingresar nombre del equipo");
    }//GEN-LAST:event_entradaNombreEquipoFocusLost

    private void entradaNombreCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreCapitanFocusGained
        organizatorFocusGained (entradaNombreCapitan, "Ingresar nombre del capitan");
    }//GEN-LAST:event_entradaNombreCapitanFocusGained

    private void entradaNombreCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreCapitanFocusLost
        organizatorFocusLost (entradaNombreCapitan, "Ingresar nombre del capitan");
    }//GEN-LAST:event_entradaNombreCapitanFocusLost

    private void entradaCedulaCapitanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCedulaCapitanFocusGained
        organizatorFocusGained (entradaCedulaCapitan, "Ingresar numero de cedula capitan");
    }//GEN-LAST:event_entradaCedulaCapitanFocusGained

    private void entradaCedulaCapitanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCedulaCapitanFocusLost
        organizatorFocusLost (entradaCedulaCapitan, "Ingresar numero de cedula capitan");
    }//GEN-LAST:event_entradaCedulaCapitanFocusLost

    private void botonSubirFotoJugadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirFotoJugadorMouseMoved
        changeButtonColor(botonSubirFotoJugador,102,102,255);
    }//GEN-LAST:event_botonSubirFotoJugadorMouseMoved

    private void botonAgregarJugadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadorMouseMoved
        changeButtonColor(botonAgregarJugador,102,102,255);
    }//GEN-LAST:event_botonAgregarJugadorMouseMoved

    private void botonRegresarIngresarDatosSingleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosSingleMouseMoved
        changeButtonColor(botonRegresarIngresarDatosSingle,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosSingleMouseMoved

    private void botonSeguirIngresarJugadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarJugadorMouseMoved
        changeButtonColor(botonSeguirIngresarJugador,102,102,255);
    }//GEN-LAST:event_botonSeguirIngresarJugadorMouseMoved

    private void botonSubirFotoJugadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSubirFotoJugadorMouseExited
        changeButtonColor(botonSubirFotoJugador,30,25,161);
    }//GEN-LAST:event_botonSubirFotoJugadorMouseExited

    private void botonSeguirIngresarJugadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarJugadorMouseExited
        changeButtonColor(botonSeguirIngresarJugador,30,25,161);
    }//GEN-LAST:event_botonSeguirIngresarJugadorMouseExited

    private void botonAgregarJugadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadorMouseExited
        changeButtonColor(botonAgregarJugador,30,25,161);
    }//GEN-LAST:event_botonAgregarJugadorMouseExited

    private void botonRegresarIngresarDatosSingleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosSingleMouseExited
        changeButtonColor(botonRegresarIngresarDatosSingle,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosSingleMouseExited

    private void botonConfigurarFaseGruposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfigurarFaseGruposMouseMoved
        changePanelColor(botonConfigurarFaseGrupos,102,102,255);
    }//GEN-LAST:event_botonConfigurarFaseGruposMouseMoved

    private void botonConfigurarFaseGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfigurarFaseGruposMouseClicked
        pestania.setSelectedIndex(9);
    }//GEN-LAST:event_botonConfigurarFaseGruposMouseClicked

    private void botonConfigurarFaseGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfigurarFaseGruposMouseExited
        changePanelColor(botonConfigurarFaseGrupos,30,25,161);
    }//GEN-LAST:event_botonConfigurarFaseGruposMouseExited

    private void botonTorneoMuerteSubitaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTorneoMuerteSubitaMouseMoved
        changePanelColor(botonTorneoMuerteSubita,102,102,255);
    }//GEN-LAST:event_botonTorneoMuerteSubitaMouseMoved

    private void botonTorneoMuerteSubitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTorneoMuerteSubitaMouseClicked
        pestania.setSelectedIndex(1);
        newTournament.setGroupsNumber(1);
        newTournament.ticketsForPlayOffJComboBox(ingresarRondaEliminacionDirecta);
        organizator.getTournamentList().add(newTournament);
    }//GEN-LAST:event_botonTorneoMuerteSubitaMouseClicked

    private void botonTorneoMuerteSubitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTorneoMuerteSubitaMouseExited
        changePanelColor(botonTorneoMuerteSubita,30,25,161);
    }//GEN-LAST:event_botonTorneoMuerteSubitaMouseExited

    private void botonFormatoLigaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFormatoLigaMouseMoved
        changePanelColor(botonFormatoLiga,102,102,255);
    }//GEN-LAST:event_botonFormatoLigaMouseMoved

    private void botonFormatoLigaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFormatoLigaMouseClicked
        pestania.setSelectedIndex(1);
        newTournament.setGroupsNumber(1);
        newTournament.ticketsForPlayOffJComboBox(ingresarRondaEliminacionDirecta);
        organizator.getTournamentList().add(newTournament);
    }//GEN-LAST:event_botonFormatoLigaMouseClicked

    private void botonFormatoLigaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFormatoLigaMouseExited
        changePanelColor(botonFormatoLiga,30,25,161);
    }//GEN-LAST:event_botonFormatoLigaMouseExited

    private void entradaCantidadJugadoresPorGrupoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresPorGrupoFocusGained
        organizatorFocusGained (entradaCantidadJugadoresPorGrupo, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresPorGrupoFocusGained

    private void entradaCantidadJugadoresPorGrupoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresPorGrupoFocusLost
        organizatorFocusLost (entradaCantidadJugadoresPorGrupo, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresPorGrupoFocusLost

    private void entradaCantidadJugadoresPorGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresPorGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCantidadJugadoresPorGrupoActionPerformed

    private void ingresarCantidadDeGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarCantidadDeGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarCantidadDeGruposActionPerformed

    private void botonSeguirFaseGruposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirFaseGruposMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirFaseGruposMouseMoved

    private void botonSeguirFaseGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirFaseGruposMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirFaseGruposMouseExited

    private void botonSeguirFaseGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirFaseGruposActionPerformed
        int numberGroups = organizatorGetNumberOfGroupsJComboBox(ingresarCantidadDeGrupos);
        newTournament.drawGroups(numberGroups);
        newTournament.ticketsForPlayOffJComboBox(ingresarRondaEliminacionDirecta);
        organizator.getTournamentList().add(newTournament);
    }//GEN-LAST:event_botonSeguirFaseGruposActionPerformed

    private void botonRegresarConfigurarFaseGruposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposMouseMoved

    private void botonRegresarConfigurarFaseGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposMouseClicked
        pestania.setSelectedIndex(8);
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposMouseClicked

    private void botonRegresarConfigurarFaseGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposMouseExited

    private void entradaCantidadJugadoresEliminacionDirectaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresEliminacionDirectaFocusGained
        organizatorFocusGained (entradaCantidadJugadoresEliminacionDirecta, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresEliminacionDirectaFocusGained

    private void entradaCantidadJugadoresEliminacionDirectaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresEliminacionDirectaFocusLost
        organizatorFocusLost (entradaCantidadJugadoresEliminacionDirecta, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresEliminacionDirectaFocusLost

    private void entradaCantidadJugadoresEliminacionDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresEliminacionDirectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCantidadJugadoresEliminacionDirectaActionPerformed

    private void verTorneo2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo2MouseMoved
        changePanelColor(verTorneo2,102,102,255);
    }//GEN-LAST:event_verTorneo2MouseMoved

    private void verTorneo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo2MouseClicked
        organizatorSeeTournament(pestania, 2, organizator.getTournamentList());   
        int numberGroups = whichTournamentShow(1, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        switch(numberGroups){
            case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(1).getParticipantsList());
            case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(1).getParticipantsList(), organizator.getTournamentList().get(1).getGroupsList());
            case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(1).getParticipantsList(), organizator.getTournamentList().get(1).getGroupsList());
            case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(1).getParticipantsList(), organizator.getTournamentList().get(1).getGroupsList());
            case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(1).getParticipantsList(), organizator.getTournamentList().get(1).getGroupsList());
            case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(1).getParticipantsList(), organizator.getTournamentList().get(1).getGroupsList());
            default -> pestania.setSelectedIndex(0);
        }
    }//GEN-LAST:event_verTorneo2MouseClicked

    private void verTorneo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo2MouseExited
        changePanelColor(verTorneo2,30,25,161);
    }//GEN-LAST:event_verTorneo2MouseExited

    private void verTorneo3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo3MouseMoved
        changePanelColor(verTorneo3,102,102,255);
    }//GEN-LAST:event_verTorneo3MouseMoved

    private void verTorneo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo3MouseClicked
        organizatorSeeTournament(pestania, 3, organizator.getTournamentList());   
        int numberGroups = whichTournamentShow(2, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        switch(numberGroups){
            case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(2).getParticipantsList());
            case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(2).getParticipantsList(), organizator.getTournamentList().get(2).getGroupsList());
            case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(2).getParticipantsList(), organizator.getTournamentList().get(2).getGroupsList());
            case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(2).getParticipantsList(), organizator.getTournamentList().get(2).getGroupsList());
            case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(2).getParticipantsList(), organizator.getTournamentList().get(2).getGroupsList());
            case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(2).getParticipantsList(), organizator.getTournamentList().get(2).getGroupsList());
            default -> pestania.setSelectedIndex(0);
        }
    }//GEN-LAST:event_verTorneo3MouseClicked

    private void verTorneo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo3MouseExited
        changePanelColor(verTorneo3,102,102,255);
    }//GEN-LAST:event_verTorneo3MouseExited

    private void verTorneo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo1MouseMoved
        changePanelColor(verTorneo1,102,102,255);
    }//GEN-LAST:event_verTorneo1MouseMoved

    private void verTorneo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo1MouseClicked
        organizatorSeeTournament(pestania, 1, organizator.getTournamentList());   
        int numberGroups = whichTournamentShow(0, organizator.getTournamentList());
        organizatorTabbedPanelSeeTournaments(pestania, numberGroups);
        switch(numberGroups){
            case 1 -> loadTournamentTypeZero(tablaGeneralLiga, organizator.getTournamentList().get(0).getParticipantsList());
            case 2 -> loadTournamentTypeOne(tablaJugadoresAgregados1, tablaJugadoresAgregados2, tablaJugadoresAgregados3, organizator.getTournamentList().get(0).getParticipantsList(), organizator.getTournamentList().get(0).getGroupsList());
            case 3 -> loadTournamentTypeTwo(tablaJugadoresAgregados4, tablaJugadoresAgregados5, tablaJugadoresAgregados8, tablaJugadoresAgregados9, organizator.getTournamentList().get(0).getParticipantsList(), organizator.getTournamentList().get(0).getGroupsList());
            case 4 -> loadTournamentTypeThree(tablaJugadoresAgregados6, tablaJugadoresAgregados10, tablaJugadoresAgregados12, tablaJugadoresAgregados13, tablaJugadoresAgregados14, organizator.getTournamentList().get(0).getParticipantsList(), organizator.getTournamentList().get(0).getGroupsList());
            case 5 -> loadTournamentTypeFour(tablaJugadoresAgregados15, tablaJugadoresAgregados16, tablaJugadoresAgregados18, tablaJugadoresAgregados21, tablaJugadoresAgregados22, tablaJugadoresAgregados20, organizator.getTournamentList().get(0).getParticipantsList(), organizator.getTournamentList().get(0).getGroupsList());
            case 6 -> loadTournamentTypeFive(tablaJugadoresAgregados19, tablaJugadoresAgregados23, tablaJugadoresAgregados25, tablaJugadoresAgregados27, tablaJugadoresAgregados28, tablaJugadoresAgregados29, tablaJugadoresAgregados26, organizator.getTournamentList().get(2).getParticipantsList(), organizator.getTournamentList().get(0).getGroupsList());
            default -> pestania.setSelectedIndex(0);
        }
    }//GEN-LAST:event_verTorneo1MouseClicked

    private void verTorneo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTorneo1MouseExited
        changePanelColor(verTorneo1,30,25,161);
    }//GEN-LAST:event_verTorneo1MouseExited

    private void botonCrearTorneoDoble3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble3MouseMoved

    private void botonCrearTorneoDoble3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble3MouseClicked

    private void botonCrearTorneoDoble3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble3MouseExited

    private void botonCrearTorneoEquipo3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo3MouseMoved

    private void botonCrearTorneoEquipo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo3MouseClicked

    private void botonCrearTorneoEquipo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo3MouseExited

    private void botonCrearTorneoSingle3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle3MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle3MouseMoved

    private void botonCrearTorneoSingle3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle3MouseClicked

    private void botonCrearTorneoSingle3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle3MouseExited

    private void botonCrearTorneoDoble4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble4MouseMoved

    private void botonCrearTorneoDoble4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble4MouseClicked

    private void botonCrearTorneoDoble4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble4MouseExited

    private void botonCrearTorneoEquipo4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo4MouseMoved

    private void botonCrearTorneoEquipo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo4MouseClicked

    private void botonCrearTorneoEquipo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo4MouseExited

    private void botonCrearTorneoSingle4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle4MouseMoved

    private void botonCrearTorneoSingle4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle4MouseClicked

    private void botonCrearTorneoSingle4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle4MouseExited

    private void botonCrearTorneoDoble5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble5MouseMoved

    private void botonCrearTorneoDoble5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble5MouseClicked

    private void botonCrearTorneoDoble5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble5MouseExited

    private void botonCrearTorneoEquipo5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo5MouseMoved

    private void botonCrearTorneoEquipo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo5MouseClicked

    private void botonCrearTorneoEquipo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo5MouseExited

    private void botonCrearTorneoSingle5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle5MouseMoved

    private void botonCrearTorneoSingle5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle5MouseClicked

    private void botonCrearTorneoSingle5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle5MouseExited

    private void botonCrearTorneoDoble6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble6MouseMoved

    private void botonCrearTorneoDoble6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble6MouseClicked

    private void botonCrearTorneoDoble6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble6MouseExited

    private void botonCrearTorneoEquipo6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo6MouseMoved

    private void botonCrearTorneoEquipo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo6MouseClicked

    private void botonCrearTorneoEquipo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo6MouseExited

    private void botonCrearTorneoSingle6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle6MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle6MouseMoved

    private void botonCrearTorneoSingle6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle6MouseClicked

    private void botonCrearTorneoSingle6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle6MouseExited

    private void botonCrearTorneoDoble7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble7MouseMoved

    private void botonCrearTorneoDoble7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble7MouseClicked

    private void botonCrearTorneoDoble7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble7MouseExited

    private void botonCrearTorneoEquipo7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo7MouseMoved

    private void botonCrearTorneoEquipo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo7MouseClicked

    private void botonCrearTorneoEquipo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo7MouseExited

    private void botonCrearTorneoSingle7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle7MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle7MouseMoved

    private void botonCrearTorneoSingle7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle7MouseClicked

    private void botonCrearTorneoSingle7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle7MouseExited

    private void botonCrearTorneoDoble8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble8MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble8MouseMoved

    private void botonCrearTorneoDoble8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble8MouseClicked

    private void botonCrearTorneoDoble8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDoble8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoDoble8MouseExited

    private void botonCrearTorneoEquipo8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo8MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo8MouseMoved

    private void botonCrearTorneoEquipo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo8MouseClicked

    private void botonCrearTorneoEquipo8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipo8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoEquipo8MouseExited

    private void botonCrearTorneoSingle8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle8MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle8MouseMoved

    private void botonCrearTorneoSingle8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle8MouseClicked

    private void botonCrearTorneoSingle8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingle8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCrearTorneoSingle8MouseExited

    private void botonSeguirIngresarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarJugadorMouseClicked
        pestania.setSelectedIndex(8);
    }//GEN-LAST:event_botonSeguirIngresarJugadorMouseClicked

    private void botonSeguirFaseGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirFaseGruposMouseClicked
        pestania.setSelectedIndex(1);
        
    }//GEN-LAST:event_botonSeguirFaseGruposMouseClicked

    private void botonBuscarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarJugadorMouseClicked
        Player player = organizator.searchPlayer(textoBuscarJugador);
        organizatorShowPlayerInformation(mostrarNombre, jTextField11, jTextField2, jTextField6, jTextField3, jTextField8, jTextField5, jTextField10, jTextField7, player);
    }//GEN-LAST:event_botonBuscarJugadorMouseClicked

    private void botonRegresarConfigurarFaseGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposMouseEntered

    private void botonSeguirDuplasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirDuplasMouseClicked
        pestania.setSelectedIndex(8);
    }//GEN-LAST:event_botonSeguirDuplasMouseClicked

    private void botonSeguirEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirEquipoMouseClicked
        pestania.setSelectedIndex(8);
    }//GEN-LAST:event_botonSeguirEquipoMouseClicked

    private void botonRegresarConfigurarFaseGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarConfigurarFaseGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarConfigurarFaseGruposActionPerformed

    private void ingresarRondaEliminacionDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarRondaEliminacionDirectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarRondaEliminacionDirectaActionPerformed

    private void botonRegresarIngresarDatosTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneoActionPerformed

    private void botonRegresarIngresarDatosTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneoMouseClicked
        pestania.setSelectedIndex(0);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneoMouseClicked

    private void botonSeguirIngresarDatosTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneoActionPerformed

    private void botonSeguirIngresarDatosTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneoMouseClicked
        newTournament = CreateTournament(entradaNombreTorneo, entradaCostoTorneo, entradaCantidadJugadores, ingresarRondaEliminacionDirecta);
        List<Player> playerList = new ArrayList<>();
        newTournament.setParticipantsList(playerList);
        GetUpTournamentFromPartOne(pestania, opcionCrearTorneo, entradaNombreTorneo, entradaCostoTorneo, entradaCantidadJugadores, ingresarRondaEliminacionDirecta);     
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneoMouseClicked

    private void entradaCantidadJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCantidadJugadoresActionPerformed

    private void entradaCantidadJugadoresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresFocusLost
        organizatorFocusLost (entradaCantidadJugadores, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresFocusLost

    private void entradaCantidadJugadoresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCantidadJugadoresFocusGained
        organizatorFocusGained (entradaCantidadJugadores, "Ingresar un numero");
    }//GEN-LAST:event_entradaCantidadJugadoresFocusGained

    private void entradaCostoTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaCostoTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaCostoTorneoActionPerformed

    private void entradaCostoTorneoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCostoTorneoFocusLost
        organizatorFocusLost (entradaCostoTorneo, "Ingresar costo del torneo");
    }//GEN-LAST:event_entradaCostoTorneoFocusLost

    private void entradaCostoTorneoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaCostoTorneoFocusGained
        organizatorFocusGained (entradaCostoTorneo, "Ingresar costo del torneo");
    }//GEN-LAST:event_entradaCostoTorneoFocusGained

    private void entradaNombreTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreTorneoActionPerformed

    private void entradaNombreTorneoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneoFocusLost
        organizatorFocusLost (entradaNombreTorneo, "Ingresar nombre del torneo");
    }//GEN-LAST:event_entradaNombreTorneoFocusLost

    private void entradaNombreTorneoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNombreTorneoFocusGained
        organizatorFocusGained (entradaNombreTorneo, "Ingresar nombre del torneo");
    }//GEN-LAST:event_entradaNombreTorneoFocusGained

    private void ingresarRondaEliminacionDirecta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarRondaEliminacionDirecta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarRondaEliminacionDirecta3ActionPerformed

    private void botonBuscarJugadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarJugadorMouseExited
        changeButtonColor(botonBuscarJugador,30,25,161);
    }//GEN-LAST:event_botonBuscarJugadorMouseExited

    private void botonBuscarJugadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarJugadorMouseMoved
        changeButtonColor(botonBuscarJugador,102,102,255);
    }//GEN-LAST:event_botonBuscarJugadorMouseMoved

    private void botonRegresarIngresarDatosTorneoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneoMouseExited
        changeButtonColor(botonRegresarIngresarDatosTorneo,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneoMouseExited

    private void botonRegresarIngresarDatosTorneoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosTorneoMouseMoved
        changeButtonColor(botonRegresarIngresarDatosTorneo,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosTorneoMouseMoved

    private void botonSeguirIngresarDatosTorneoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneoMouseExited
        changeButtonColor(botonSeguirIngresarDatosTorneo,30,25,161);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneoMouseExited

    private void botonSeguirIngresarDatosTorneoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirIngresarDatosTorneoMouseMoved
        changeButtonColor(botonSeguirIngresarDatosTorneo,102,102,255);
    }//GEN-LAST:event_botonSeguirIngresarDatosTorneoMouseMoved

    private void botonFotoJugadorAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFotoJugadorAMouseExited
        changeButtonColor(botonFotoJugadorA,30,25,161);
    }//GEN-LAST:event_botonFotoJugadorAMouseExited

    private void botonFotoJugadorAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFotoJugadorAMouseMoved
        changeButtonColor(botonFotoJugadorA,102,102,255);
    }//GEN-LAST:event_botonFotoJugadorAMouseMoved

    private void botonFotoJugadorBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFotoJugadorBMouseExited
        changeButtonColor(botonFotoJugadorB,30,25,161);
    }//GEN-LAST:event_botonFotoJugadorBMouseExited

    private void botonFotoJugadorBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFotoJugadorBMouseMoved
        changeButtonColor(botonFotoJugadorB,102,102,255);
    }//GEN-LAST:event_botonFotoJugadorBMouseMoved

    private void botonRegresarIngresarDatosDoblesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosDoblesMouseExited
        changeButtonColor(botonRegresarIngresarDatosDobles,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosDoblesMouseExited

    private void botonRegresarIngresarDatosDoblesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosDoblesMouseMoved
        changeButtonColor(botonRegresarIngresarDatosDobles,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosDoblesMouseMoved

    private void botonAgregarJugadoresDuplaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadoresDuplaMouseExited
        changeButtonColor(botonAgregarJugadoresDupla,30,25,161);
    }//GEN-LAST:event_botonAgregarJugadoresDuplaMouseExited

    private void botonAgregarJugadoresDuplaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarJugadoresDuplaMouseMoved
        changeButtonColor(botonAgregarJugadoresDupla,102,102,255);
    }//GEN-LAST:event_botonAgregarJugadoresDuplaMouseMoved

    private void botonSeguirDuplasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirDuplasMouseExited
        changeButtonColor(botonSeguirDuplas,30,25,161);
    }//GEN-LAST:event_botonSeguirDuplasMouseExited

    private void botonSeguirDuplasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirDuplasMouseMoved
        changeButtonColor(botonSeguirDuplas,102,102,255);
    }//GEN-LAST:event_botonSeguirDuplasMouseMoved

    private void botonFotoCapitanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFotoCapitanMouseExited
        changeButtonColor(botonFotoCapitan,30,25,161);
    }//GEN-LAST:event_botonFotoCapitanMouseExited

    private void botonFotoCapitanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFotoCapitanMouseMoved
        changeButtonColor(botonFotoCapitan,102,102,255);
    }//GEN-LAST:event_botonFotoCapitanMouseMoved

    private void botonRegresarIngresarDatosEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosEquipoMouseExited
        changeButtonColor(botonRegresarIngresarDatosEquipo,30,25,161);
    }//GEN-LAST:event_botonRegresarIngresarDatosEquipoMouseExited

    private void botonRegresarIngresarDatosEquipoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarIngresarDatosEquipoMouseMoved
        changeButtonColor(botonRegresarIngresarDatosEquipo,102,102,255);
    }//GEN-LAST:event_botonRegresarIngresarDatosEquipoMouseMoved

    private void botonAgregarEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarEquipoMouseExited
        changeButtonColor(botonAgregarEquipo,30,25,161);
    }//GEN-LAST:event_botonAgregarEquipoMouseExited

    private void botonAgregarEquipoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarEquipoMouseMoved
        changeButtonColor(botonAgregarEquipo,102,102,255);
    }//GEN-LAST:event_botonAgregarEquipoMouseMoved

    private void botonSeguirEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirEquipoMouseExited
        changeButtonColor(botonSeguirEquipo,30,25,161);
    }//GEN-LAST:event_botonSeguirEquipoMouseExited

    private void botonSeguirEquipoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSeguirEquipoMouseMoved
        changeButtonColor(botonSeguirEquipo,102,102,255);
    }//GEN-LAST:event_botonSeguirEquipoMouseMoved

    private void botonCrearTorneoSingleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingleMouseExited
        changePanelColor(botonCrearTorneoSingle,30,25,161);
    }//GEN-LAST:event_botonCrearTorneoSingleMouseExited

    private void botonCrearTorneoSingleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingleMouseClicked
        pestania.setSelectedIndex(4);
        opcionCrearTorneo = 1;
    }//GEN-LAST:event_botonCrearTorneoSingleMouseClicked

    private void botonCrearTorneoSingleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoSingleMouseMoved
        changePanelColor(botonCrearTorneoSingle,102,102,255);
    }//GEN-LAST:event_botonCrearTorneoSingleMouseMoved

    private void botonCrearTorneoEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipoMouseExited
        changePanelColor(botonCrearTorneoEquipo,30,25,161);
    }//GEN-LAST:event_botonCrearTorneoEquipoMouseExited

    private void botonCrearTorneoEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipoMouseClicked
        pestania.setSelectedIndex(4);
        opcionCrearTorneo = 3;
    }//GEN-LAST:event_botonCrearTorneoEquipoMouseClicked

    private void botonCrearTorneoEquipoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoEquipoMouseMoved
        changePanelColor(botonCrearTorneoEquipo,102,102,255);
    }//GEN-LAST:event_botonCrearTorneoEquipoMouseMoved

    private void botonCrearTorneoDobleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDobleMouseExited
        changePanelColor(botonCrearTorneoDoble,30,25,161);
    }//GEN-LAST:event_botonCrearTorneoDobleMouseExited

    private void botonCrearTorneoDobleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDobleMouseClicked
        pestania.setSelectedIndex(4);
        opcionCrearTorneo = 2;
    }//GEN-LAST:event_botonCrearTorneoDobleMouseClicked

    private void botonCrearTorneoDobleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearTorneoDobleMouseMoved
        changePanelColor(botonCrearTorneoDoble,102,102,255);
    }//GEN-LAST:event_botonCrearTorneoDobleMouseMoved

    public final void visual(JTable tabla){
       Object[][] jugadores= readPlayerListTournament(organizator.getPlayerList());
       String[] columna= new String[]{"Jugador A", "Jugador B", "Fecha"}; 
       DefaultTableModel dt= new DefaultTableModel(jugadores, columna);
       tabla.setModel(dt);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconoCalendario1;
    private javax.swing.JButton botonAgregarEquipo;
    private javax.swing.JButton botonAgregarJugador;
    private javax.swing.JButton botonAgregarJugadoresDupla;
    private javax.swing.JButton botonBuscarJugador;
    private javax.swing.JPanel botonConfigurarFaseGrupos;
    private javax.swing.JPanel botonCrearTorneoDoble;
    private javax.swing.JPanel botonCrearTorneoDoble3;
    private javax.swing.JPanel botonCrearTorneoDoble4;
    private javax.swing.JPanel botonCrearTorneoDoble5;
    private javax.swing.JPanel botonCrearTorneoDoble6;
    private javax.swing.JPanel botonCrearTorneoDoble7;
    private javax.swing.JPanel botonCrearTorneoDoble8;
    private javax.swing.JPanel botonCrearTorneoEquipo;
    private javax.swing.JPanel botonCrearTorneoEquipo3;
    private javax.swing.JPanel botonCrearTorneoEquipo4;
    private javax.swing.JPanel botonCrearTorneoEquipo5;
    private javax.swing.JPanel botonCrearTorneoEquipo6;
    private javax.swing.JPanel botonCrearTorneoEquipo7;
    private javax.swing.JPanel botonCrearTorneoEquipo8;
    private javax.swing.JPanel botonCrearTorneoSingle;
    private javax.swing.JPanel botonCrearTorneoSingle3;
    private javax.swing.JPanel botonCrearTorneoSingle4;
    private javax.swing.JPanel botonCrearTorneoSingle5;
    private javax.swing.JPanel botonCrearTorneoSingle6;
    private javax.swing.JPanel botonCrearTorneoSingle7;
    private javax.swing.JPanel botonCrearTorneoSingle8;
    private javax.swing.JPanel botonFormatoLiga;
    private javax.swing.JButton botonFotoCapitan;
    private javax.swing.JButton botonFotoJugadorA;
    private javax.swing.JButton botonFotoJugadorB;
    private javax.swing.JPanel botonMenuVerTorneos;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JButton botonRegresarConfigurarFaseGrupos;
    private javax.swing.JButton botonRegresarIngresarDatosDobles;
    private javax.swing.JButton botonRegresarIngresarDatosEquipo;
    private javax.swing.JButton botonRegresarIngresarDatosSingle;
    private javax.swing.JButton botonRegresarIngresarDatosTorneo;
    private javax.swing.JLabel botonSalida;
    private javax.swing.JButton botonSeguirDuplas;
    private javax.swing.JButton botonSeguirEquipo;
    private javax.swing.JButton botonSeguirFaseGrupos;
    private javax.swing.JButton botonSeguirIngresarDatosTorneo;
    private javax.swing.JButton botonSeguirIngresarJugador;
    private javax.swing.JButton botonSubirFotoJugador;
    private javax.swing.JPanel botonTorneoMuerteSubita;
    private javax.swing.JTextField entradaCantidadJugadores;
    private javax.swing.JTextField entradaCantidadJugadoresEliminacionDirecta;
    private javax.swing.JTextField entradaCantidadJugadoresPorGrupo;
    private javax.swing.JTextField entradaCedulaCapitan;
    private javax.swing.JTextField entradaCorreoCapitan;
    private javax.swing.JTextField entradaCostoTorneo;
    private javax.swing.JTextField entradaEmailJugador;
    private javax.swing.JTextField entradaEmailJugadorA;
    private javax.swing.JTextField entradaEmailJugadorB;
    private javax.swing.JTextField entradaEquipoJugador;
    private javax.swing.JTextField entradaEquipoJugadorA;
    private javax.swing.JTextField entradaEquipoJugadorB;
    private javax.swing.JTextField entradaFechaNacimientoCapitan;
    private javax.swing.JTextField entradaFechaNacimientoJugador;
    private javax.swing.JTextField entradaFechaNacimientoJugadorA;
    private javax.swing.JTextField entradaFechaNacimientoJugadorB;
    private javax.swing.JTextField entradaIDJugador;
    private javax.swing.JTextField entradaIdJugadorA;
    private javax.swing.JTextField entradaIdJugadorB;
    private javax.swing.JTextField entradaNombreCapitan;
    private javax.swing.JTextField entradaNombreEquipo;
    private javax.swing.JTextField entradaNombreJugador;
    private javax.swing.JTextField entradaNombreJugadorA;
    private javax.swing.JTextField entradaNombreJugadorB;
    private javax.swing.JTextField entradaNombreTorneo;
    private javax.swing.JTextField entradaNumeroTelefonoCapitan;
    private javax.swing.JTextField entradaNumeroTelefonoJugador;
    private javax.swing.JTextField entradaNumeroTelefonoJugadorA;
    private javax.swing.JTextField entradaNumeroTelefonoJugadorB;
    private javax.swing.JLabel iconoSuperior;
    private javax.swing.JComboBox<String> ingresarCantidadDeGrupos;
    private javax.swing.JComboBox<String> ingresarRondaEliminacionDirecta;
    private javax.swing.JComboBox<String> ingresarRondaEliminacionDirecta3;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator66;
    private javax.swing.JSeparator jSeparator67;
    private javax.swing.JSeparator jSeparator68;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField mostrarNombre;
    private javax.swing.JComboBox<String> opcionesCategoriaCapitan;
    private javax.swing.JComboBox<String> opcionesCategoriaJugador;
    private javax.swing.JComboBox<String> opcionesCategoriaJugadorA;
    private javax.swing.JComboBox<String> opcionesCategoriaJugadorB;
    private javax.swing.JTabbedPane pestania;
    private javax.swing.JPanel pestaniaCrearTorneoInicio;
    private javax.swing.JPanel pestaniaCrearTorneoInicio1;
    private javax.swing.JTable tablaDuplasAgregadas;
    private javax.swing.JTable tablaGeneralLiga;
    private javax.swing.JTable tablaJugadoresAgregados;
    private javax.swing.JTable tablaJugadoresAgregados1;
    private javax.swing.JTable tablaJugadoresAgregados10;
    private javax.swing.JTable tablaJugadoresAgregados11;
    private javax.swing.JTable tablaJugadoresAgregados12;
    private javax.swing.JTable tablaJugadoresAgregados13;
    private javax.swing.JTable tablaJugadoresAgregados14;
    private javax.swing.JTable tablaJugadoresAgregados15;
    private javax.swing.JTable tablaJugadoresAgregados16;
    private javax.swing.JTable tablaJugadoresAgregados17;
    private javax.swing.JTable tablaJugadoresAgregados18;
    private javax.swing.JTable tablaJugadoresAgregados19;
    private javax.swing.JTable tablaJugadoresAgregados2;
    private javax.swing.JTable tablaJugadoresAgregados20;
    private javax.swing.JTable tablaJugadoresAgregados21;
    private javax.swing.JTable tablaJugadoresAgregados22;
    private javax.swing.JTable tablaJugadoresAgregados23;
    private javax.swing.JTable tablaJugadoresAgregados24;
    private javax.swing.JTable tablaJugadoresAgregados25;
    private javax.swing.JTable tablaJugadoresAgregados26;
    private javax.swing.JTable tablaJugadoresAgregados27;
    private javax.swing.JTable tablaJugadoresAgregados28;
    private javax.swing.JTable tablaJugadoresAgregados29;
    private javax.swing.JTable tablaJugadoresAgregados3;
    private javax.swing.JTable tablaJugadoresAgregados4;
    private javax.swing.JTable tablaJugadoresAgregados5;
    private javax.swing.JTable tablaJugadoresAgregados6;
    private javax.swing.JTable tablaJugadoresAgregados7;
    private javax.swing.JTable tablaJugadoresAgregados8;
    private javax.swing.JTable tablaJugadoresAgregados9;
    private javax.swing.JTextField textoBuscarJugador;
    private javax.swing.JPanel verTorneo1;
    private javax.swing.JPanel verTorneo2;
    private javax.swing.JPanel verTorneo3;
    // End of variables declaration//GEN-END:variables

}
