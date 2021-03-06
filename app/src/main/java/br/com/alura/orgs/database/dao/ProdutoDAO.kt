package br.com.alura.orgs.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.alura.orgs.model.Produto

@Dao
interface ProdutoDAO {
    @Query("SELECT * FROM Produto")
    fun buscaTodos() : List<Produto>

    @Insert
    fun insere(produto: Produto)
}