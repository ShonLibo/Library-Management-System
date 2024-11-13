module BorrowingModule {
    exports BorrowPackage;
    requires BookModule;
    requires transitive VisitorModule;
}